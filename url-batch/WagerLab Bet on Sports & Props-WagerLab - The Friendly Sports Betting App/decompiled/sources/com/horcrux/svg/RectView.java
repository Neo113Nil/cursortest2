package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* loaded from: classes7.dex */
class RectView extends RenderableView {
    private SVGLength mH;
    private SVGLength mRx;
    private SVGLength mRy;
    private SVGLength mW;
    private SVGLength mX;
    private SVGLength mY;

    public RectView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.from(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.from(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.from(dynamic);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
        invalidate();
    }

    public void setRx(Dynamic dynamic) {
        this.mRx = SVGLength.from(dynamic);
        invalidate();
    }

    public void setRy(Dynamic dynamic) {
        this.mRy = SVGLength.from(dynamic);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Path getPath(Canvas canvas, Paint paint) {
        double relativeOnWidth;
        double relativeOnHeight;
        double d;
        double d2;
        Path path = new Path();
        double relativeOnWidth2 = relativeOnWidth(this.mX);
        double relativeOnHeight2 = relativeOnHeight(this.mY);
        double relativeOnWidth3 = relativeOnWidth(this.mW);
        double relativeOnHeight3 = relativeOnHeight(this.mH);
        SVGLength sVGLength = this.mRx;
        if (sVGLength != null || this.mRy != null) {
            if (sVGLength == null) {
                relativeOnWidth = relativeOnHeight(this.mRy);
            } else if (this.mRy == null) {
                relativeOnWidth = relativeOnWidth(sVGLength);
            } else {
                relativeOnWidth = relativeOnWidth(sVGLength);
                relativeOnHeight = relativeOnHeight(this.mRy);
                d = relativeOnWidth3 / 2.0d;
                if (relativeOnWidth > d) {
                    relativeOnWidth = d;
                }
                d2 = relativeOnHeight3 / 2.0d;
                if (relativeOnHeight > d2) {
                    relativeOnHeight = d2;
                }
                path.addRoundRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), (float) relativeOnWidth, (float) relativeOnHeight, Path.Direction.CW);
            }
            relativeOnHeight = relativeOnWidth;
            d = relativeOnWidth3 / 2.0d;
            if (relativeOnWidth > d) {
            }
            d2 = relativeOnHeight3 / 2.0d;
            if (relativeOnHeight > d2) {
            }
            path.addRoundRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), (float) relativeOnWidth, (float) relativeOnHeight, Path.Direction.CW);
        } else {
            path.addRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), Path.Direction.CW);
            path.close();
        }
        this.elements = new ArrayList<>();
        this.elements.add(new PathElement(ElementType.kCGPathElementMoveToPoint, new Point[]{new Point(relativeOnWidth2, relativeOnHeight2)}));
        double d3 = relativeOnWidth3 + relativeOnWidth2;
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(d3, relativeOnHeight2)}));
        double d4 = relativeOnHeight2 + relativeOnHeight3;
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(d3, d4)}));
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(relativeOnWidth2, d4)}));
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }
}
