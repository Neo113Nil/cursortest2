package com.my.target;

import com.my.target.common.models.ImageData;
import com.my.target.common.models.ShareButtonData;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class z0 extends b {
    private final ArrayList X;
    private final ArrayList Y;
    private rg Z;
    private pg a0;
    private String b0;
    private ImageData c0;
    private String d0;
    private String e0;
    private String f0;
    private l3 g0;
    private rf h0;
    private ue i0;
    private boolean j0;
    private boolean k0;
    private boolean l0;
    private boolean m0;
    private boolean n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;
    private boolean r0;
    private boolean s0;
    private float t0;
    private float u0;
    private float v0;
    private float w0;
    private int x0;

    public z0(w0 w0Var, sh shVar) {
        super(w0Var, shVar, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = null;
        this.a0 = null;
        this.d0 = "Close";
        this.e0 = "Replay";
        this.f0 = "Ad can be skipped after %ds";
        this.j0 = false;
        this.k0 = true;
        this.l0 = true;
        this.m0 = true;
        this.n0 = true;
        this.o0 = true;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = true;
        this.t0 = 10.0f;
        this.u0 = 5.0f;
        this.v0 = -1.0f;
        this.w0 = -1.0f;
        this.x0 = 0;
    }

    public void A(String str) {
        this.b0 = str;
    }

    public void B(String str) {
        this.d0 = str;
    }

    public void C(String str) {
        this.f0 = str;
    }

    public void D(String str) {
        this.e0 = str;
    }

    public String X() {
        return this.b0;
    }

    public float Y() {
        return this.t0;
    }

    public float Z() {
        return this.u0;
    }

    public void a(c3 c3Var) {
        this.X.add(c3Var);
    }

    public String a0() {
        return this.d0;
    }

    public String b0() {
        return this.f0;
    }

    public void c(ImageData imageData) {
        this.c0 = imageData;
    }

    public ArrayList c0() {
        return new ArrayList(this.X);
    }

    public void d(float f) {
        this.u0 = f;
    }

    public l3 d0() {
        return this.g0;
    }

    public void e(float f) {
        this.v0 = f;
    }

    public int e0() {
        return this.x0;
    }

    public void f(boolean z) {
        this.o0 = z;
    }

    public float f0() {
        return this.v0;
    }

    public void g(boolean z) {
        this.s0 = z;
    }

    public float g0() {
        return this.w0;
    }

    public void h(boolean z) {
        this.m0 = z;
    }

    public ue h0() {
        return this.i0;
    }

    public void i(boolean z) {
        this.p0 = z;
    }

    public ImageData i0() {
        return this.c0;
    }

    public void j(boolean z) {
        this.q0 = z;
    }

    public rf j0() {
        return this.h0;
    }

    public void k(boolean z) {
        this.r0 = z;
    }

    public String k0() {
        return this.e0;
    }

    public void l(boolean z) {
        this.j0 = z;
    }

    public ArrayList l0() {
        return new ArrayList(this.Y);
    }

    public void m(boolean z) {
        this.k0 = z;
    }

    public pg m0() {
        return this.a0;
    }

    public void n(boolean z) {
        this.l0 = z;
    }

    public rg n0() {
        return this.Z;
    }

    public void o(boolean z) {
        this.n0 = z;
    }

    public boolean o0() {
        return this.o0;
    }

    public boolean p0() {
        return this.s0;
    }

    public boolean q0() {
        return this.m0;
    }

    public boolean r0() {
        return this.p0;
    }

    public boolean s0() {
        return this.q0;
    }

    public boolean t0() {
        return this.r0;
    }

    public boolean u0() {
        return this.j0;
    }

    public boolean v0() {
        return this.k0;
    }

    public boolean w0() {
        return this.l0;
    }

    public boolean x0() {
        return this.n0;
    }

    public void a(rg rgVar) {
        this.Z = rgVar;
    }

    public void c(float f) {
        this.t0 = f;
    }

    public void e(int i) {
        this.x0 = i;
    }

    public void f(float f) {
        this.w0 = f;
    }

    @Override // com.my.target.b
    public String k() {
        l3 d0 = d0();
        return d0 != null ? d0.f() : super.k();
    }

    public void a(pg pgVar) {
        this.a0 = pgVar;
    }

    public void a(ShareButtonData shareButtonData) {
        this.Y.add(shareButtonData);
    }

    public void a(l3 l3Var) {
        this.g0 = l3Var;
    }

    public void a(rf rfVar) {
        this.h0 = rfVar;
    }

    public void a(ue ueVar) {
        this.i0 = ueVar;
    }
}
