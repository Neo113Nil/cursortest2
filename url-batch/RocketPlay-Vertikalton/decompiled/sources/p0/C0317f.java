package p0;

import B.r;
import K.C0008b0;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317f extends AbstractC0318g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3750c;
    public C0008b0 d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3751e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0314c f3752f = new C0314c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0315d f3749b = new C0315d();

    public C0317f(Context context) {
        this.f3750c = context;
    }

    @Override // p0.AbstractC0318g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0315d c0315d = this.f3749b;
        c0315d.f3745a.draw(canvas);
        if (c0315d.f3746b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getAlpha() : this.f3749b.f3745a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3749b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3753a;
        return drawable != null ? D.a.c(drawable) : this.f3749b.f3745a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3753a != null) {
            return new C0316e(this.f3753a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3749b.f3745a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3749b.f3745a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.getOpacity() : this.f3749b.f3745a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0315d c0315d;
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0315d = this.f3749b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0312a.f3741e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0327p c0327p = new C0327p();
                        ThreadLocal threadLocal = r.f85a;
                        c0327p.f3753a = B.k.a(resources, resourceId, theme);
                        new C0326o(c0327p.f3753a.getConstantState());
                        c0327p.f3800f = false;
                        c0327p.setCallback(this.f3752f);
                        C0327p c0327p2 = c0315d.f3745a;
                        if (c0327p2 != null) {
                            c0327p2.setCallback(null);
                        }
                        c0315d.f3745a = c0327p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0312a.f3742f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3750c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0315d.f3745a.f3797b.f3787b.f3785o.getOrDefault(string, null));
                        if (c0315d.f3747c == null) {
                            c0315d.f3747c = new ArrayList();
                            c0315d.d = new o.b();
                        }
                        c0315d.f3747c.add(loadAnimator);
                        c0315d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0315d.f3746b == null) {
            c0315d.f3746b = new AnimatorSet();
        }
        c0315d.f3746b.playTogether(c0315d.f3747c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3749b.f3745a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3753a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3749b.f3746b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.isStateful() : this.f3749b.f3745a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3749b.f3745a.setBounds(rect);
        }
    }

    @Override // p0.AbstractC0318g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.setLevel(i) : this.f3749b.f3745a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3753a;
        return drawable != null ? drawable.setState(iArr) : this.f3749b.f3745a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3749b.f3745a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3749b.f3745a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3749b.f3745a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            F1.l.l0(drawable, i);
        } else {
            this.f3749b.f3745a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3749b.f3745a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3749b.f3745a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3749b.f3745a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0315d c0315d = this.f3749b;
        if (c0315d.f3746b.isStarted()) {
            return;
        }
        c0315d.f3746b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3753a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3749b.f3746b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
