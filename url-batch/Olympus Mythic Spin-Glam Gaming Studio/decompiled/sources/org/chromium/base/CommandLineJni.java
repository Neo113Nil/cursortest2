package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import java.util.List;
import org.chromium.base.CommandLine;

/* loaded from: classes12.dex */
class CommandLineJni implements CommandLine.Natives {
    private static JniTestInstanceHolder sOverride;

    CommandLineJni() {
    }

    public static CommandLine.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CommandLine.Natives) obj;
        }
        return new CommandLineJni();
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitchWithValue(String str, String str2) {
        GEN_JNI.org_chromium_base_CommandLine_appendSwitchWithValue(str, str2);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public String getSwitchValue(String str) {
        return (String) GEN_JNI.org_chromium_base_CommandLine_getSwitchValue(str);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public boolean hasSwitch(String str) {
        return GEN_JNI.org_chromium_base_CommandLine_hasSwitch(str);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void init(List list) {
        GEN_JNI.org_chromium_base_CommandLine_init(list);
    }
}
