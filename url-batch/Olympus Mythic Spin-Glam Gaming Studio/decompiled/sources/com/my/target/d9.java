package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class d9 extends i8 {
    private final lf d0;
    private final List e0;
    private eb f0;
    private i8 g0;
    private ImageData h0;
    private String i0;
    private boolean j0;
    private boolean k0;
    private int l0;

    private d9(w0 w0Var) {
        super(w0Var);
        this.j0 = true;
        this.k0 = false;
        this.e0 = new ArrayList();
        this.d0 = lf.l();
    }

    public static d9 a(w0 w0Var) {
        return new d9(w0Var);
    }

    public static d9 m0() {
        return a(w0.d);
    }

    public void A(String str) {
        this.i0 = str;
    }

    public void d(ImageData imageData) {
        this.h0 = imageData;
    }

    public ImageData d0() {
        return this.h0;
    }

    public void e(int i) {
        this.l0 = i;
    }

    public String e0() {
        return this.i0;
    }

    public i8 f0() {
        return this.g0;
    }

    public List g0() {
        return this.e0;
    }

    public lf h0() {
        return this.d0;
    }

    public void i(boolean z) {
        this.j0 = z;
    }

    public int i0() {
        return this.l0;
    }

    public void j(boolean z) {
        this.k0 = z;
    }

    public eb j0() {
        return this.f0;
    }

    public boolean k0() {
        if (this.f0 != null) {
            return false;
        }
        return this.j0;
    }

    public boolean l0() {
        return this.k0;
    }

    public void a(eb ebVar) {
        this.f0 = ebVar;
    }

    public void a(k8 k8Var) {
        this.e0.add(k8Var);
    }

    public void a(i8 i8Var) {
        this.g0 = i8Var;
    }
}
