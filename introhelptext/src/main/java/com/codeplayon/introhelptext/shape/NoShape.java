package com.codeplayon.introhelptext.shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.codeplayon.introhelptext.target.HelpTextTarget;

public class NoShape implements Shape {

    @Override
    public void updateTarget(HelpTextTarget target) {
        // do nothing
    }

    @Override
    public int getTotalRadius() {
        return 0;
    }

    @Override
    public void setPadding(int padding) {
        // do nothing
    }

    @Override
    public void draw(Canvas canvas, Paint paint, int x, int y) {
        // do nothing
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}

