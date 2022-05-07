package com.codeplayon.introhelptext.target;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

public class HelpTextTargetFiled implements HelpTextTarget {

        private final View mView;

    public HelpTextTargetFiled(View view) {
            mView = view;
        }

    public HelpTextTargetFiled(int viewId, Activity activity) {
            mView = activity.findViewById(viewId);
        }

        @Override
        public Point getPoint() {
            int[] location = new int[2];
            mView.getLocationInWindow(location);
            int x = location[0] + mView.getWidth() / 2;
            int y = location[1] + mView.getHeight() / 2;
            return new Point(x, y);
        }

        @Override
        public Rect getBounds() {
            int[] location = new int[2];
            mView.getLocationInWindow(location);
            return new Rect(
                    location[0],
                    location[1],
                    location[0] + mView.getMeasuredWidth(),
                    location[1] + mView.getMeasuredHeight()
            );
        }

        public View getView() {
            return mView;
        }
    }

