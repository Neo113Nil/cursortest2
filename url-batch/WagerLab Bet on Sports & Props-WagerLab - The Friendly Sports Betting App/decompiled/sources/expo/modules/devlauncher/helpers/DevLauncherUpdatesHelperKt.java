package expo.modules.devlauncher.helpers;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.updatesinterface.UpdatesInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DevLauncherUpdatesHelper.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0086@¢\u0006\u0002\u0010\u0011\u001aD\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005¨\u0006\u0018"}, d2 = {"loadUpdate", "Lexpo/modules/updatesinterface/UpdatesInterface$Update;", "Lexpo/modules/updatesinterface/UpdatesInterface;", "configuration", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "context", "Landroid/content/Context;", "shouldContinue", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "manifest", "", "(Lexpo/modules/updatesinterface/UpdatesInterface;Ljava/util/HashMap;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUpdatesConfigurationWithUrl", "url", "Landroid/net/Uri;", "projectUrl", "runtimeVersion", "installationID", "expo-dev-launcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherUpdatesHelperKt {
    public static final Object loadUpdate(UpdatesInterface updatesInterface, HashMap<String, Object> hashMap, Context context, final Function1<? super JSONObject, Boolean> function1, Continuation<? super UpdatesInterface.Update> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        updatesInterface.fetchUpdateWithConfiguration(hashMap, new UpdatesInterface.UpdateCallback() { // from class: expo.modules.devlauncher.helpers.DevLauncherUpdatesHelperKt$loadUpdate$2$1
            @Override // expo.modules.updatesinterface.UpdatesInterface.UpdateCallback
            public void onProgress(int successfulAssetCount, int failedAssetCount, int totalAssetCount) {
            }

            @Override // expo.modules.updatesinterface.UpdatesInterface.UpdateCallback
            public void onSuccess(UpdatesInterface.Update update) {
                if (update != null) {
                    Continuation<UpdatesInterface.Update> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m12363constructorimpl(update));
                }
            }

            @Override // expo.modules.updatesinterface.UpdatesInterface.UpdateCallback
            public void onFailure(Exception e) {
                Continuation<UpdatesInterface.Update> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                if (e == null) {
                    e = new Exception("There was an unexpected error loading the update.");
                }
                continuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(e)));
            }

            @Override // expo.modules.updatesinterface.UpdatesInterface.UpdateCallback
            public boolean onManifestLoaded(final JSONObject manifest) {
                Intrinsics.checkNotNullParameter(manifest, "manifest");
                if (function1.invoke(manifest).booleanValue()) {
                    return true;
                }
                Continuation<UpdatesInterface.Update> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(new UpdatesInterface.Update(manifest) { // from class: expo.modules.devlauncher.helpers.DevLauncherUpdatesHelperKt$loadUpdate$2$1$onManifestLoaded$1
                    private final JSONObject manifest;

                    {
                        this.manifest = manifest;
                    }

                    @Override // expo.modules.updatesinterface.UpdatesInterface.Update
                    public JSONObject getManifest() {
                        return this.manifest;
                    }

                    @Override // expo.modules.updatesinterface.UpdatesInterface.Update
                    public String getLaunchAssetPath() {
                        throw new Exception("Tried to access launch asset path for a manifest that was not loaded");
                    }
                }));
                return false;
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final HashMap<String, Object> createUpdatesConfigurationWithUrl(Uri url, Uri projectUrl, String runtimeVersion, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(projectUrl, "projectUrl");
        Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("Expo-Updates-Environment", "DEVELOPMENT"));
        if (str != null) {
            hashMapOf.put("Expo-Dev-Client-ID", str);
        }
        return MapsKt.hashMapOf(TuplesKt.to("updateUrl", url), TuplesKt.to("scopeKey", projectUrl.toString()), TuplesKt.to("hasEmbeddedUpdate", false), TuplesKt.to("launchWaitMs", 60000), TuplesKt.to("checkOnLaunch", "ALWAYS"), TuplesKt.to(ViewProps.ENABLED, true), TuplesKt.to("requestHeaders", hashMapOf), TuplesKt.to("runtimeVersion", runtimeVersion));
    }
}
