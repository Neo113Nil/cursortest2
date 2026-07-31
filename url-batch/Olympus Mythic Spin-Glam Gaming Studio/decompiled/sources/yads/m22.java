package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class m22 {
    public final View a;
    public CheckBox b;
    public ProgressBar c;
    public List d = CollectionsKt.emptyList();
    public final Map e;

    public m22(View view, LinkedHashMap linkedHashMap) {
        this.a = view;
        this.e = MapsKt.toMutableMap(linkedHashMap);
    }
}
