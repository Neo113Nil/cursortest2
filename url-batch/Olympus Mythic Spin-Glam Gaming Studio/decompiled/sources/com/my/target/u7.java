package com.my.target;

import android.text.TextUtils;
import com.my.target.internal.api.internalnativead.InternalNativeAdController;
import com.my.target.internal.api.internalnativead.models.survey.InternalSurveyResult;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class u7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, List list, String str2, InternalNativeAdController.OnSurveySentListener onSurveySentListener) {
        try {
            l5 a = m5.a().a(str2, a(str, list).toString());
            boolean d = a.d();
            if (onSurveySentListener != null) {
                onSurveySentListener.onSurveySent(d, a.a());
            }
            if (d) {
                mi.a("InternalNativeAdSurveyUtils: Survey's result has been sent");
            } else {
                mi.b("InternalNativeAdSurveyUtils: Survey's result hasn't been sent");
            }
        } catch (Throwable th) {
            if (onSurveySentListener != null) {
                try {
                    onSurveySentListener.onSurveySent(false, th.getMessage() == null ? "Unable to sent survey." : th.getMessage());
                } catch (Throwable th2) {
                    mi.b("InternalNativeAdSurveyUtils: caught exception on listener's call: " + th2.getMessage());
                }
            }
            mi.b("InternalNativeAdSurveyUtils: can't create json for the survey");
        }
    }

    public static void b(final String str, final List list, final String str2, final InternalNativeAdController.OnSurveySentListener onSurveySentListener) {
        o0.d(new Runnable() { // from class: com.my.target.u7$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                u7.a(str2, list, str, onSurveySentListener);
            }
        });
    }

    private static JSONObject a(String str, List list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("form_id", str);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InternalSurveyResult internalSurveyResult = (InternalSurveyResult) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("block_id", internalSurveyResult.getBlockId());
            List<String> answerIds = internalSurveyResult.getAnswerIds();
            if (answerIds != null && !answerIds.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str2 : answerIds) {
                    if (str2 != null) {
                        jSONArray2.put(str2);
                    }
                }
                jSONObject2.put("answer_ids", jSONArray2);
            }
            String answerText = internalSurveyResult.getAnswerText();
            if (!TextUtils.isEmpty(answerText)) {
                jSONObject2.put("answer_text", answerText);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.putOpt("answers", jSONArray);
        return jSONObject;
    }
}
