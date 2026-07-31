package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* compiled from: DivSightAction.kt */
/* loaded from: classes.dex */
public interface DivSightAction {
    DivDownloadCallbacks getDownloadCallbacks();

    Expression getLogId();

    Expression getLogLimit();

    JSONObject getPayload();

    Expression getReferer();

    String getScopeId();

    DivActionTyped getTyped();

    Expression getUrl();

    Expression isEnabled();
}
