package jdk.Games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class SnakeGame {
    // define constants
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    private static final int SNAKE_SIZE = 10;
    private static final int FOOD_SIZE = 10;
    private static final Color BACKGROUND_COLOR = Color.WHITE;
    private static final Color SNAKE_COLOR = Color.GREEN;
    private static final Color FOOD_COLOR = Color.RED;

    // declare global variables
    private JFrame frame;
    private JPanel panel;
    private ArrayList<int[]> snakeBody;
    private int foodX;
    private int foodY;
    private String direction;
    private boolean isGameOver;
    private Timer timer;

    // constructor
    public SnakeGame() {
        // initialize variables
        snakeBody = new ArrayList<int[]>();
        snakeBody.add(new int[]{WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2});
        foodX = (int) (Math.random() * (WINDOW_WIDTH - FOOD_SIZE));
        foodY = (int) (Math.random() * (WINDOW_HEIGHT - FOOD_SIZE));
        direction = "right";
        isGameOver = false;

        // set up GUI
        frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setResizable(false);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // draw snake
                for (int i = 0; i < snakeBody.size(); i++) {
                    g.setColor(SNAKE_COLOR);
                    g.fillRect(snakeBody.get(i)[0], snakeBody.get(i)[1], SNAKE_SIZE, SNAKE_SIZE);
                }
                // draw food
                g.setColor(FOOD_COLOR);
                g.fillRect(foodX, foodY, FOOD_SIZE, FOOD_SIZE);
            }
        };

        panel.setFocusable(true);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT && !direction.equals("left")) {
                    direction = "right";
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT && !direction.equals("right")) {
                    direction = "left";
                } else if (e.getKeyCode() == KeyEvent.VK_UP && !direction.equals("down")) {
                    direction = "up";
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN && !direction.equals("up")) {
                    direction = "down";
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);

        // set up timer
        int speed = 200;
        timer = new Timer(speed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveSnake();
                checkCollision();
                panel.repaint();
            }
        });
        timer.start();
    }

    private void moveSnake() {
        int[] head = snakeBody.get(0);
        int[] newHead = new int[]{0, 0};
        if (direction.equals("right")) {
            newHead[0] = head[0] + SNAKE_SIZE;
            newHead[1] = head[1];
        } else if (direction.equals("left")) {
            newHead[0] = head[0] - SNAKE_SIZE;
            newHead[1] = head[1];
        } else if (direction.equals("up")) {
            newHead[0] = head[0];
            newHead[1] = head[1] - SNAKE_SIZE;
        } else if (direction.equals("down")) {
            newHead[0] = head[0];
            newHead[1] = head[1] + SNAKE_SIZE;
        }
        // wrap snake around screen
        if (newHead[0] > WINDOW_WIDTH) {
            newHead[0] = 0;
        } else if (newHead[0] < 0) {
            newHead[0] = WINDOW_WIDTH - SNAKE_SIZE;
        } else if (newHead[1] > WINDOW_HEIGHT) {
            newHead[1] = 0;
        } else if (newHead[1] < 0) {
            newHead[1] = WINDOW_HEIGHT - SNAKE_SIZE;
        }
        snakeBody.add(0, newHead);
        snakeBody.remove(snakeBody.size() - 1);
    }

    private void checkCollision() {
        int[] head = snakeBody.get(0);

        // check collision with food
        if (head[0] <= foodX && head[0] + SNAKE_SIZE >= foodX + FOOD_SIZE
                && head[1] <= foodY && head[1] + SNAKE_SIZE >= foodY + FOOD_SIZE) {

            /*
             * To prevent the snake from eating the food, instead of adding
             * a new block to the snake, we simply move the food to another position
             */

            foodX = (int) (Math.random() * (WINDOW_WIDTH - FOOD_SIZE));
            foodY = (int) (Math.random() * (WINDOW_HEIGHT - FOOD_SIZE));
        }

        // check collision with snake body
        for (int i = 1; i < snakeBody.size(); i++) {
            int[] block = snakeBody.get(i);
            if (head[0] == block[0] && head[1] == block[1]) {
                isGameOver = true;
                timer.stop();
                JOptionPane.showMessageDialog(frame, "Game over!");
            }
        }
    }


    public static void main(String[] args) {
        new SnakeGame();
    }
}

