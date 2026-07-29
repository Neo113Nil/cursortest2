package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* renamed from: o.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1739q5 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ C1739q5() {
        this.a = 2;
    }

    public void a() {
        C0214Id c0214Id;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1317jj.a(drawable);
        }
        if (drawable == null || (c0214Id = (C0214Id) this.d) == null) {
            return;
        }
        C1409l5.d(drawable, c0214Id, imageView.getDrawableState());
    }

    public int b() {
        int contentSensitivity;
        int i = this.b;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        View findViewById = ((Activity) this.c).findViewById(i);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i + "not found");
    }

    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1886sL.f;
        C0950e6 F = C0950e6.F(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) F.i;
        AZ.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) F.i, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = EB.t(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1317jj.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC1788qs.c(imageView, F.w(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC1788qs.d(imageView, AbstractC1317jj.b(typedArray.getInt(3, -1), null));
            }
            F.L();
        } catch (Throwable th) {
            F.L();
            throw th;
        }
    }

    public void d(int i) {
        int contentSensitivity;
        int i2 = this.b;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        View findViewById = ((Activity) this.c).findViewById(i2);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i) {
            return;
        }
        findViewById.setContentSensitivity(i);
        findViewById.invalidate();
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((EnumC1359kL) this.c) == EnumC1359kL.i) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                String sb2 = sb.toString();
                AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C1739q5(EnumC1359kL enumC1359kL, int i, String str) {
        this.a = 3;
        this.c = enumC1359kL;
        this.b = i;
        this.d = str;
    }

    public C1739q5(int i, AbstractActivityC0560Vm abstractActivityC0560Vm, C1818rJ c1818rJ) {
        this.a = 1;
        this.c = abstractActivityC0560Vm;
        this.b = i;
        this.d = c1818rJ;
        c1818rJ.i = this;
    }

    public C1739q5(ImageView imageView) {
        this.a = 0;
        this.b = 0;
        this.c = imageView;
    }
}
