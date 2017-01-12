/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author voigr4865
 */
public class Enemy {
    
    private Texture topEnemy1;
    private Texture bottomEnemy1;
    private Rectangle bounds1;
    private Rectangle bounds2;
    private int enemyX;
    private int enemyY;
    
    public Enemy(int x, int y){
        
        enemyX = x;
        enemyY = y;
        topEnemy1 = new Texture("Galaga_Enemy1.png");
        bottomEnemy1 = new Texture("Galaga_Enemy1.png");
        
        bounds1 = new Rectangle(enemyX, enemyY, topEnemy1.getWidth(), topEnemy1.getHeight());
        bounds2 = new Rectangle(enemyX, enemyY, bottomEnemy1.getWidth(), bottomEnemy1.getHeight());
    }
    
    public void render(SpriteBatch batch) {
        batch.draw(topEnemy1, enemyX, enemyY);
        batch.draw(bottomEnemy1, enemyX, enemyY + 30);
    }
    
    public void update(float deltaTime){
        
        
    }
    
    public int getX(){
        return enemyX;
    }
    
    public int getY(){
        return enemyY;
    }
    
}
