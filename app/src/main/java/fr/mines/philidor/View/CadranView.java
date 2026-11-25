package fr.mines.philidor.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import org.jspecify.annotations.NonNull;

public class CadranView extends View {
    private final Paint pinceau =
            new Paint(Paint.ANTI_ALIAS_FLAG);
    public CadranView(Context c) {
        super(c);
    }
    public CadranView(Context c, AttributeSet a) {
        super(c, a); // utilisé par le XML
    }
    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        float cx = 30;
        float cy = 200;
        float side = getWidth()-2*cx;
        float lside = side/8f;
        int n = 0;
        while  (n <= 8) {
            int np = 0;
            while  (np <= 8) {
                pinceau.setColor(Color.GREEN);
                pinceau.setStyle(Paint.Style.FILL);
                canvas.drawRect(np*lside, n*lside, np*lside + lside, n*lside + lside, pinceau);
                np = np + 1;
                //pinceau.setColor(Color.BLACK);
                //pinceau.setStyle(Paint.Style.FILL);
                //canvas.drawRect(cx, cy, side, side, pinceau);
                np = np + 1;
            }
            n = n + 1;
        }
        //pinceau.setStrokeWidth(8);
        pinceau.setColor(Color.GREEN);
        pinceau.setStyle(Paint.Style.FILL);

        //canvas.drawLine(cx, cy,getWidth()-cx,cy, pinceau);
        //canvas.drawLine(getWidth()-cx, cy,getWidth()-cx,getWidth()-2*cx + cy, pinceau);
        //canvas.drawLine(getWidth()-cx,getWidth()-2*cx + cy,cx,getWidth()-2*cx + cy, pinceau);
        //canvas.drawLine(cx,getWidth()-2*cx + cy,cx,cy, pinceau);

        canvas.drawRect(cx  ,cy,side,side, pinceau);
    }
}


