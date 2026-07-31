package com.smaato.sdk.ng.views.shape.path.parser;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import com.smaato.sdk.ng.NextGen;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes5.dex */
public class SvgToPath {
    static final String n = "SvgToPath";
    private static final Matrix o = new Matrix();
    private final XmlPullParser a;
    private float j;
    private float k;
    private Path l;
    private final RectF b = new RectF();
    private final Deque<Path> c = new LinkedList();
    private final Deque<Matrix> d = new LinkedList();
    private HashMap<String, String> e = new HashMap<>();
    private float f = 72.0f;
    private boolean g = false;
    private int h = 0;
    private boolean i = false;
    private PathInfo m = null;

    private SvgToPath(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    private static PathInfo a(InputStream inputStream, boolean z, float f) {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            SvgToPath svgToPath = new SvgToPath(newPullParser);
            svgToPath.a(f);
            if (z) {
                newPullParser.setInput(new InputStreamReader(inputStream));
                svgToPath.d();
            } else {
                a aVar = new a(inputStream);
                XmlPullParser newPullParser2 = newInstance.newPullParser();
                newPullParser2.setInput(new InputStreamReader(aVar.b()));
                b bVar = new b(newPullParser2);
                bVar.b();
                svgToPath.e = bVar.a;
                newPullParser.setInput(new InputStreamReader(aVar.b()));
                svgToPath.d();
            }
            return svgToPath.m;
        } catch (Exception e) {
            NextGen.reportException(e);
            Log.w(n, "Parse error: " + e);
            throw new RuntimeException(e);
        }
    }

    private Path b() {
        Path pop = this.c.pop();
        this.l = this.c.peek();
        return pop;
    }

    private Matrix c() {
        return this.d.pop();
    }

    private void e() {
        Path path = new Path();
        this.l = path;
        this.c.add(path);
    }

    public static PathInfo getSVGFromInputStream(InputStream inputStream) {
        return a(inputStream, true, 72.0f);
    }

    void d() throws XmlPullParserException, IOException {
        int eventType = this.a.getEventType();
        do {
            if (eventType == 2) {
                f();
            } else if (eventType == 3) {
                a();
            }
            eventType = this.a.next();
        } while (eventType != 1);
    }

    void f() {
        ArrayList<Float> arrayList;
        String name = this.a.getName();
        if (this.i) {
            return;
        }
        if (name.equals("svg")) {
            this.j = Math.round(a("width", this.a, Float.valueOf(0.0f)).floatValue());
            this.k = Math.round(a("height", this.a, Float.valueOf(0.0f)).floatValue());
            c a = c.a("viewBox", this.a);
            e();
            Matrix matrix = o;
            if (a != null && (arrayList = a.a) != null && arrayList.size() == 4) {
                float f = this.j;
                if (f < 0.1f || this.k < -0.1f) {
                    this.j = a.a.get(2).floatValue() - a.a.get(0).floatValue();
                    this.j = a.a.get(3).floatValue() - a.a.get(3).floatValue();
                } else {
                    matrix.setScale(f / (a.a.get(2).floatValue() - a.a.get(0).floatValue()), this.k / (a.a.get(3).floatValue() - a.a.get(1).floatValue()));
                }
            }
            a(matrix);
            return;
        }
        if (name.equals("defs")) {
            this.i = true;
            return;
        }
        if (name.equals("use")) {
            String a2 = d.a("xlink:href", this.a);
            String a3 = d.a("transform", this.a);
            String a4 = d.a(VastAttributes.HORIZONTAL_POSITION, this.a);
            String a5 = d.a(VastAttributes.VERTICAL_POSITION, this.a);
            if (a3 != null || a4 != null || a5 != null) {
                if (a3 != null) {
                    d.a(a3);
                }
                if (a4 != null || a5 != null) {
                    if (a4 != null) {
                        d.a(a4);
                    }
                    if (a5 != null) {
                        d.a(a5);
                    }
                }
            }
            for (int i = 0; i < this.a.getAttributeCount(); i++) {
                String attributeName = this.a.getAttributeName(i);
                if (!VastAttributes.HORIZONTAL_POSITION.equals(attributeName) && !VastAttributes.VERTICAL_POSITION.equals(attributeName) && !"width".equals(attributeName) && !"height".equals(attributeName) && !"xlink:href".equals(attributeName) && !"transform".equals(attributeName)) {
                    d.a(this.a.getAttributeValue(i));
                }
            }
            this.e.get(a2.substring(1));
            return;
        }
        if (name.equals("g")) {
            if (this.g) {
                this.h++;
            }
            if ("none".equals(d.a("display", this.a)) && !this.g) {
                this.g = true;
                this.h = 1;
            }
            a(this.a);
            e();
            return;
        }
        if (!this.g && name.equals("rect")) {
            Float a6 = a(VastAttributes.HORIZONTAL_POSITION, this.a, Float.valueOf(0.0f));
            Float a7 = a(VastAttributes.VERTICAL_POSITION, this.a, Float.valueOf(0.0f));
            Float a8 = a("width", this.a);
            Float a9 = a("height", this.a);
            Float a10 = a("rx", this.a, Float.valueOf(0.0f));
            Float a11 = a("ry", this.a, Float.valueOf(0.0f));
            Path path = new Path();
            if (a10.floatValue() > 0.0f || a11.floatValue() > 0.0f) {
                this.b.set(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue());
                path.addRoundRect(this.b, a10.floatValue(), a11.floatValue(), Path.Direction.CW);
            } else {
                path.addRect(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue(), Path.Direction.CW);
            }
            a(this.a);
            path.transform(c());
            this.l.addPath(path);
            return;
        }
        if (!this.g && name.equals("line")) {
            Float a12 = a("x1", this.a);
            Float a13 = a("x2", this.a);
            Float a14 = a("y1", this.a);
            Float a15 = a("y2", this.a);
            Path path2 = new Path();
            path2.moveTo(a12.floatValue(), a14.floatValue());
            path2.lineTo(a13.floatValue(), a15.floatValue());
            a(this.a);
            path2.transform(c());
            this.l.addPath(path2);
            return;
        }
        if (!this.g && name.equals("circle")) {
            Float a16 = a("cx", this.a);
            Float a17 = a("cy", this.a);
            Float a18 = a("r", this.a);
            if (a16 == null || a17 == null || a18 == null) {
                return;
            }
            Path path3 = new Path();
            path3.addCircle(a16.floatValue(), a17.floatValue(), a18.floatValue(), Path.Direction.CW);
            a(this.a);
            path3.transform(c());
            this.l.addPath(path3);
            return;
        }
        if (!this.g && name.equals("ellipse")) {
            Float a19 = a("cx", this.a);
            Float a20 = a("cy", this.a);
            Float a21 = a("rx", this.a);
            Float a22 = a("ry", this.a);
            if (a19 == null || a20 == null || a21 == null || a22 == null) {
                return;
            }
            this.b.set(a19.floatValue() - a21.floatValue(), a20.floatValue() - a22.floatValue(), a19.floatValue() + a21.floatValue(), a20.floatValue() + a22.floatValue());
            Path path4 = new Path();
            path4.addOval(this.b, Path.Direction.CW);
            a(this.a);
            path4.transform(c());
            this.l.addPath(path4);
            return;
        }
        if (this.g || !(name.equals("polygon") || name.equals("polyline"))) {
            if (!this.g && name.equals("path")) {
                Path a23 = f.a(d.a("d", this.a));
                a(this.a);
                a23.transform(c());
                this.l.addPath(a23);
                return;
            }
            if ((this.g || !name.equals("metadata")) && !this.g) {
                String.format("Unrecognized tag: %s (%s)", name, b(this.a));
                return;
            }
            return;
        }
        c a24 = c.a("points", this.a);
        if (a24 != null) {
            Path path5 = new Path();
            ArrayList<Float> arrayList2 = a24.a;
            if (arrayList2.size() > 1) {
                path5.moveTo(arrayList2.get(0).floatValue(), arrayList2.get(1).floatValue());
                for (int i2 = 2; i2 < arrayList2.size(); i2 += 2) {
                    path5.lineTo(arrayList2.get(i2).floatValue(), arrayList2.get(i2 + 1).floatValue());
                }
                if (name.equals("polygon")) {
                    path5.close();
                }
                a(this.a);
                path5.transform(c());
                this.l.addPath(path5);
            }
        }
    }

    private String b(XmlPullParser xmlPullParser) {
        String str = "";
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            str = str + " " + xmlPullParser.getAttributeName(i) + "='" + xmlPullParser.getAttributeValue(i) + "'";
        }
        return str;
    }

    void a(float f) {
        this.f = f;
    }

    private void a(XmlPullParser xmlPullParser) {
        String a = d.a("transform", xmlPullParser);
        this.d.push(a == null ? o : g.a(a));
    }

    private void a(Matrix matrix) {
        if (matrix == null) {
            matrix = o;
        }
        this.d.push(matrix);
    }

    void a() {
        String name = this.a.getName();
        if (this.i) {
            if (name.equals("defs")) {
                this.i = false;
                return;
            }
            return;
        }
        if (name.equals("svg")) {
            Path b = b();
            b.transform(c());
            this.m = new PathInfo(b, this.j, this.k);
        } else if (name.equals("g")) {
            if (this.g) {
                int i = this.h - 1;
                this.h = i;
                if (i == 0) {
                    this.g = false;
                }
            }
            Path b2 = b();
            b2.transform(c());
            this.l.addPath(b2);
        }
    }

    final Float a(String str, XmlPullParser xmlPullParser) {
        return a(str, xmlPullParser, (Float) null);
    }

    final Float a(String str, XmlPullParser xmlPullParser, Float f) {
        Float a = d.a(str, xmlPullParser, this.f, this.j, this.k);
        return a == null ? f : a;
    }
}
