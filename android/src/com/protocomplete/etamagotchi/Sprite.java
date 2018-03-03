package com.protocomplete.etamagotchi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

class Sprite {
  int posX, posY, velX, velY, height, width;
  Bitmap source;
  RenderView target;

  public Sprite(RenderView view, Bitmap bitmap) {
    height = bitmap.getHeight();
    width = bitmap.getWidth();
    target = view;
    source = bitmap;
    posX = posY = velX = velY = 0;
  }

  public void OnDraw(Canvas canvas) {
    Update();
    Rect surface = new Rect(0, 0, width, height);
    Rect output = new Rect(posX, posY, posX+width, posY+height);
    canvas.drawBitmap(source, surface, output, null);
  }

  public void Update() {
    posX += velX;
    posY += velY;
  }

  public void setVelX(int x) {
    velX = x;
  }

  public void setVelY(int y) {
    velY = y;
  }
}