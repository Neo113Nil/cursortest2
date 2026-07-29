package expo.modules.easclient;

import android.content.Context;
import androidx.tracing.Trace;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.ConstantComponentBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: EASClientModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/easclient/EASClientModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-eas-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EASClientModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null".toString());
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        EASClientModule eASClientModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (eASClientModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(eASClientModule);
            moduleDefinitionBuilder.Name("EASClient");
            ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder("clientID");
            constantComponentBuilder.setGetter(new Function0<String>() { // from class: expo.modules.easclient.EASClientModule$definition$lambda$2$$inlined$Constant$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    Context context;
                    context = EASClientModule.this.getContext();
                    return new EASClientID(context).getUuid().toString();
                }
            });
            moduleDefinitionBuilder.getConstants().put("clientID", constantComponentBuilder);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
