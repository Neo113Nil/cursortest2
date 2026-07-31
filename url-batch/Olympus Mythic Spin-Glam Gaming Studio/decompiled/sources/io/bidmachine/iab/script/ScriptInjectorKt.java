package io.bidmachine.iab.script;

import io.bidmachine.rendering.model.ScriptConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0007\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"", "Lio/bidmachine/rendering/model/ScriptConfig;", "", "Lio/bidmachine/rendering/model/ScriptConfig$Type;", "types", "a", "(Ljava/util/List;[Lio/bidmachine/rendering/model/ScriptConfig$Type;)Ljava/util/List;", "(Ljava/util/List;)Ljava/util/List;", "", "(Lio/bidmachine/rendering/model/ScriptConfig;)Ljava/lang/String;", "bidmachine-android-sdk_bb_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ScriptInjectorKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScriptConfig.Type.values().length];
            try {
                iArr[ScriptConfig.Type.DocumentEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final List a(List list) {
        final Comparator comparator = new Comparator() { // from class: io.bidmachine.iab.script.ScriptInjectorKt$sortedByPriority$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((ScriptConfig) t).getPriority()), Integer.valueOf(((ScriptConfig) t2).getPriority()));
            }
        };
        return CollectionsKt.sortedWith(list, new Comparator() { // from class: io.bidmachine.iab.script.ScriptInjectorKt$sortedByPriority$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : ComparisonsKt.compareValues(((ScriptConfig) t).getScriptId(), ((ScriptConfig) t2).getScriptId());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(ScriptConfig scriptConfig) {
        ScriptConfig.Type type = scriptConfig.getType();
        if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return StringsKt.trimIndent("\n        (function() {\n          if (document.readyState === 'loading') {\n            document.addEventListener('DOMContentLoaded', function() {\n              " + scriptConfig.getSource() + "\n            });\n          } else {\n            " + scriptConfig.getSource() + "\n          }\n        })();\n    ");
        }
        return scriptConfig.getSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list, ScriptConfig.Type... typeArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ArraysKt.contains(typeArr, ((ScriptConfig) obj).getType())) {
                arrayList.add(obj);
            }
        }
        return a(arrayList);
    }
}
