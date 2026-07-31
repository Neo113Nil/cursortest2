package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class sc extends b {
    private final List X;
    private c7 Y;
    private eb Z;
    private wc a0;
    private ad b0;
    private String c0;
    private ImageData d0;
    private final rj e0;

    private sc(w0 w0Var, sh shVar, rj rjVar, g0 g0Var) {
        super(w0Var, shVar, g0Var);
        this.X = new ArrayList();
        this.c0 = "Try to play";
        this.e0 = rjVar;
    }

    public static sc a(w0 w0Var, sh shVar, g0 g0Var) {
        return a(w0Var, shVar, null, g0Var);
    }

    public void A(String str) {
        this.c0 = str;
    }

    public c7 X() {
        return this.Y;
    }

    public wc Y() {
        return this.a0;
    }

    public ImageData Z() {
        return this.d0;
    }

    public String a0() {
        return this.c0;
    }

    public ad b0() {
        return this.b0;
    }

    public void c(ImageData imageData) {
        this.d0 = imageData;
    }

    public List c0() {
        return new ArrayList(this.X);
    }

    public eb d0() {
        return this.Z;
    }

    public rj e0() {
        return this.e0;
    }

    public static sc a(w0 w0Var, sh shVar, rj rjVar, g0 g0Var) {
        return new sc(w0Var, shVar, rjVar, g0Var);
    }

    public void a(eb ebVar) {
        this.Z = ebVar;
    }

    public void a(uc ucVar) {
        this.X.add(ucVar);
    }

    public void a(c7 c7Var) {
        this.Y = c7Var;
    }

    public void a(wc wcVar) {
        this.a0 = wcVar;
    }

    public void a(ad adVar) {
        this.b0 = adVar;
    }
}
