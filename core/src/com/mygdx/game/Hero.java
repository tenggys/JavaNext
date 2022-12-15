package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

import java.util.HashMap;
import java.util.Map;

public class Hero {
    Vector2 position;
    private boolean fire;
    Map<String, MyAnim> animMap;
    private float time;

    public Hero(int x, int y, TextureAtlas atlas){
        position = new Vector2(x, y);
        animMap = new HashMap<>();
        animMap.put("stand", new MyAnim(atlas, "stay", 6, Animation.PlayMode.LOOP));
        animMap.put("fire", new MyAnim(atlas, "shot", 6, Animation.PlayMode.NORMAL));
        this.fire = false;
    }

    public void update(float delta) {
        boolean tmp;
        if (this.fire) tmp = animMap.get("fire").deltaTime(delta); else tmp = animMap.get("stand").deltaTime(delta);
        if (tmp) {
            this.fire = false;
            animMap.get("fire").setTime(0);
        }

        if (!this.fire) time += delta;
        if (!this.fire && time>2 && MathUtils.random(20)>17) {
            time = 0;
            this.fire = true;
        }
    }

    public TextureRegion getFamre() {
        TextureRegion region;
        if (this.fire) region = animMap.get("fire").getFrame(); else region = animMap.get("stand").getFrame();
        return region;
    }
}
