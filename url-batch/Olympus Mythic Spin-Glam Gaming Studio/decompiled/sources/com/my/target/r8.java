package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class r8 extends i8 {
    private final List d0;
    private final List e0;
    private ImageData f0;
    private ImageData g0;

    private r8(w0 w0Var) {
        super(w0Var);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
    }

    public static r8 a(w0 w0Var) {
        return new r8(w0Var);
    }

    public void d(ImageData imageData) {
        this.e0.add(imageData);
    }

    public List d0() {
        return new ArrayList(this.e0);
    }

    public void e(ImageData imageData) {
        this.d0.add(imageData);
    }

    public ImageData e0() {
        return this.g0;
    }

    public void f(ImageData imageData) {
        this.g0 = imageData;
    }

    public ImageData f0() {
        return this.f0;
    }

    public void g(ImageData imageData) {
        this.f0 = imageData;
    }

    public List g0() {
        return new ArrayList(this.d0);
    }

    public static r8 a(c3 c3Var) {
        r8 a = a(c3Var.f());
        a.n(c3Var.x());
        String g0 = c3Var.g0();
        if (g0 != null) {
            a.e(ImageData.newImageData(g0, c3Var.R(), c3Var.v()));
            a.H().a(c3Var.H(), 0.0f);
            a.K = c3Var.K;
        }
        return a;
    }
}
