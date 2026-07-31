package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBLinearLayout extends LinearLayout implements InterBase {
    private float a;
    private float b;
    private Map<String, String> c;
    private Map<String, Boolean> d;
    private String e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBLinearLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBLinearLayout(Context context) {
        super(context);
        this.e = "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.c.get("mbridgeStrategy");
    }

    public float getxInScreen() {
        return this.a;
    }

    public float getyInScreen() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.d;
        if (map != null && map.containsKey("mbridgeAttached") && this.d.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.d;
        if (map != null && map.containsKey("mbridgeDetached") && this.d.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getRawX();
        this.b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.d = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap b = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            c cVar = (c) b.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.width = b.a().a(attributeValue);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            break;
                        }
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                generateDefaultLayoutParams.height = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.height = b.a().a(attributeValue2);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.height = -1;
                            break;
                        }
                        break;
                    case 3:
                        generateDefaultLayoutParams.gravity = 1;
                        break;
                    case 4:
                        generateDefaultLayoutParams.gravity = 16;
                        break;
                    case 5:
                        generateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i, 0.0f);
                        break;
                    case 6:
                        setGravity(b.a().b(attributeSet.getAttributeValue(i)));
                        break;
                    case 7:
                        int a = b.a().a(attributeSet.getAttributeValue(i));
                        generateDefaultLayoutParams.bottomMargin = a;
                        generateDefaultLayoutParams.leftMargin = a;
                        generateDefaultLayoutParams.rightMargin = a;
                        generateDefaultLayoutParams.topMargin = a;
                        break;
                    case 8:
                        generateDefaultLayoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i));
                        break;
                    case 9:
                        generateDefaultLayoutParams.rightMargin = b.a().a(attributeSet.getAttributeValue(i));
                        break;
                    case 10:
                        generateDefaultLayoutParams.topMargin = b.a().a(attributeSet.getAttributeValue(i));
                        break;
                    case 11:
                        generateDefaultLayoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i));
                        break;
                    case 12:
                        generateDefaultLayoutParams.gravity = b.a().b(attributeSet.getAttributeValue(i));
                        break;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.e = "";
        this.c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.utils.c.a(this.c, this);
    }

    public MBLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = "";
    }
}
