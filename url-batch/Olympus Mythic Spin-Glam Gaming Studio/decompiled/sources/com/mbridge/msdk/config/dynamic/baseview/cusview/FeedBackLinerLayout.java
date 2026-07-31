package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class FeedBackLinerLayout extends ComponentLinearLayout implements com.mbridge.msdk.config.dynamic.baseview.inter.b {
    private FeedbackRadioGroup a;
    private String b;
    private Map<String, Object> c;
    private FeedBackLinerLayout d;

    private static class b {
        int a;
        ColorStateList b;
        int c;
        int d;
        int e;

        private b() {
        }
    }

    public FeedBackLinerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new HashMap();
        this.d = this;
    }

    private FeedbackRadioGroup a() {
        Context d = c.n().d();
        if (d == null) {
            Log.w("FeedBackLinerLayout", "Context is null");
            return null;
        }
        try {
            FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(d);
            this.a = feedbackRadioGroup;
            feedbackRadioGroup.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, v0.a(d, 4.0f), 0, 0);
            this.a.setLayoutParams(layoutParams);
            a(this.a, d);
            return this.a;
        } catch (Exception e) {
            Log.e("FeedBackLinerLayout", "Error creating FeedbackRadioGroup", e);
            return null;
        }
    }

    private void setupRadioButtonClickListener(final RadioButton radioButton) {
        radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.FeedBackLinerLayout$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedBackLinerLayout.this.a(radioButton, view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(tag), this.c);
        return hashMap;
    }

    public void init(List<Object> list) {
        if (list == null) {
            Log.w("FeedBackLinerLayout", "FBK configuration is null");
            return;
        }
        try {
            removeAllViews();
            FeedbackRadioGroup a2 = a();
            if (a2 == null) {
                Log.w("FeedBackLinerLayout", "Failed to create FeedbackRadioGroup");
                return;
            }
            a2.setTag("feedback_group");
            a(a2, list);
            addView(a2);
        } catch (Exception e) {
            Log.e("FeedBackLinerLayout", "Error initializing FeedBackLinerLayout", e);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setOutDataScope(String str) {
        this.b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (String.valueOf(map.get("clickable")).equals("true")) {
            setViewClickListener();
        }
        if (map.get("saveContent") instanceof String) {
            setOutDataScope("saveContent");
        }
        Object obj = map.get("data");
        if (obj instanceof List) {
            init((List) obj);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        if (obj instanceof List) {
            init((List) obj);
        }
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, Context context) {
        try {
            int a2 = i0.a(context, "mbridge_cm_feedback_choice_btn_bg", "drawable");
            if (a2 != 0) {
                feedbackRadioGroup.setBackgroundResource(a2);
            }
            int a3 = v0.a(context, 8.0f);
            feedbackRadioGroup.setPadding(a3, a3, a3, a3);
        } catch (Exception e) {
            Log.w("FeedBackLinerLayout", "Error setting up RadioGroup style", e);
        }
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, List<Object> list) {
        RadioButton a2;
        if (feedbackRadioGroup == null) {
            Log.w("FeedBackLinerLayout", "RadioGroup is null");
            return;
        }
        Context d = c.n().d();
        if (list != null && !list.isEmpty() && d != null) {
            try {
                b a3 = a(d);
                float size = 1.0f / list.size();
                for (int i = 0; i < list.size(); i++) {
                    String valueOf = String.valueOf(list.get(i));
                    if (!TextUtils.isEmpty(valueOf) && (a2 = a(d, valueOf, a3, size)) != null) {
                        feedbackRadioGroup.addView(a2);
                    }
                }
                return;
            } catch (Exception e) {
                Log.e("FeedBackLinerLayout", "Error adding RadioButtons to RadioGroup", e);
                return;
            }
        }
        Log.w("FeedBackLinerLayout", "Invalid parameters for adding RadioButtons");
    }

    private b a(Context context) {
        b bVar = new b();
        try {
            bVar.a = i0.a(context, "mbridge_cm_feedback_choice_btn_bg", "drawable");
            int a2 = i0.a(context, "mbridge_cm_feedback_rb_text_color_color_list", "color");
            Resources a3 = i0.a(context);
            if (a3 != null && a2 != 0) {
                try {
                    bVar.b = a3.getColorStateList(a2);
                } catch (Exception e) {
                    Log.w("FeedBackLinerLayout", "Error loading color state list", e);
                }
            }
            bVar.c = v0.a(context, 8.0f);
            bVar.d = v0.a(context, 4.0f);
            bVar.e = v0.c(context, 14.0f);
        } catch (Exception e2) {
            Log.w("FeedBackLinerLayout", "Error creating RadioButton style", e2);
        }
        return bVar;
    }

    private RadioButton a(Context context, String str, b bVar, float f) {
        try {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(str);
            radioButton.setTag(str);
            a(radioButton, bVar);
            radioButton.setLayoutParams(a(bVar, f));
            setupRadioButtonClickListener(radioButton);
            return radioButton;
        } catch (Exception e) {
            Log.e("FeedBackLinerLayout", "Error creating RadioButton for text: " + str, e);
            return null;
        }
    }

    private void a(RadioButton radioButton, b bVar) {
        try {
            ColorStateList colorStateList = bVar.b;
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
                radioButton.setButtonTintList(bVar.b);
            }
            int i = bVar.c;
            radioButton.setPadding(i, i, i, i);
            radioButton.setCompoundDrawablePadding(bVar.c / 2);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            radioButton.setSingleLine(true);
            radioButton.setTextSize(0, bVar.e);
        } catch (Exception e) {
            Log.w("FeedBackLinerLayout", "Error applying RadioButton style", e);
        }
    }

    private RadioGroup.LayoutParams a(b bVar, float f) {
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        layoutParams.weight = f;
        int i = bVar.d;
        int i2 = i / 2;
        layoutParams.setMargins(i, i2, i, i2);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(RadioButton radioButton, View view) {
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        a(radioButton);
        HashMap hashMap = new HashMap();
        hashMap.put("property", this.c);
        f.a(this.xmlView, "feedbackItemView", hashMap);
    }

    private void a(RadioButton radioButton) {
        if (TextUtils.isEmpty(this.b) || radioButton == null) {
            return;
        }
        try {
            CharSequence text = radioButton.getText();
            if (text instanceof String) {
                String valueOf = String.valueOf(text);
                if (this.c.containsKey("selectedContents")) {
                    Object obj = this.c.get("selectedContents");
                    if (obj instanceof List) {
                        List list = (List) obj;
                        list.clear();
                        list.add(valueOf);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(valueOf);
                    this.c.put("selectedContents", arrayList);
                }
            }
        } catch (Throwable th) {
            q0.b("FeedBackLinerLayout", th.getMessage(), th);
        }
    }
}
