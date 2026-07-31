package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.safedk.android.analytics.brandsafety.m;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NativeConfigurationKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NativeConfigurationKt {

    @NotNull
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    private NativeConfigurationKt() {
    }

    /* compiled from: NativeConfigurationKt.kt */
    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 ®\u00012\u00020\u0001:\n®\u0001¯\u0001°\u0001±\u0001²\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0012J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0012J\u0006\u00100\u001a\u00020\u0010J\u0006\u00101\u001a\u00020\u0012J\u0006\u00108\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\u0012J\u0006\u0010?\u001a\u00020\u0010J\u0006\u0010C\u001a\u00020\u0010J%\u0010J\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E2\u0006\u0010\b\u001a\u00020FH\u0007¢\u0006\u0002\bKJ&\u0010L\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E2\u0006\u0010\b\u001a\u00020FH\u0087\n¢\u0006\u0002\bMJ+\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020F0PH\u0007¢\u0006\u0002\bQJ,\u0010L\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020F0PH\u0087\n¢\u0006\u0002\bRJ.\u0010S\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E2\u0006\u0010T\u001a\u00020U2\u0006\u0010\b\u001a\u00020FH\u0087\u0002¢\u0006\u0002\bVJ\u001d\u0010W\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0EH\u0007¢\u0006\u0002\bXJ\u0006\u0010_\u001a\u00020\u0010J\u0006\u0010`\u001a\u00020\u0012J%\u0010J\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0E2\u0006\u0010\b\u001a\u00020bH\u0007¢\u0006\u0002\beJ&\u0010L\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0E2\u0006\u0010\b\u001a\u00020bH\u0087\n¢\u0006\u0002\bfJ+\u0010N\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020b0PH\u0007¢\u0006\u0002\bgJ,\u0010L\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020b0PH\u0087\n¢\u0006\u0002\bhJ.\u0010S\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0E2\u0006\u0010T\u001a\u00020U2\u0006\u0010\b\u001a\u00020bH\u0087\u0002¢\u0006\u0002\biJ\u001d\u0010W\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0EH\u0007¢\u0006\u0002\bjJ\u0006\u0010n\u001a\u00020\u0010J\u0006\u0010o\u001a\u00020\u0012J\u0006\u0010{\u001a\u00020\u0010J\u0006\u0010\u007f\u001a\u00020\u0010J\u0007\u0010\u0080\u0001\u001a\u00020\u0012J\u0007\u0010\u0087\u0001\u001a\u00020\u0010J\u0007\u0010\u0088\u0001\u001a\u00020\u0012J\u0007\u0010\u008c\u0001\u001a\u00020\u0010J\u0007\u0010\u0090\u0001\u001a\u00020\u0010J\u0007\u0010\u0094\u0001\u001a\u00020\u0010J'\u0010J\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020b\u0012\u0005\u0012\u00030\u0096\u00010E2\u0006\u0010\b\u001a\u00020bH\u0007¢\u0006\u0003\b\u0098\u0001J(\u0010L\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020b\u0012\u0005\u0012\u00030\u0096\u00010E2\u0006\u0010\b\u001a\u00020bH\u0087\n¢\u0006\u0003\b\u0099\u0001J-\u0010N\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020b\u0012\u0005\u0012\u00030\u0096\u00010E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020b0PH\u0007¢\u0006\u0003\b\u009a\u0001J.\u0010L\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020b\u0012\u0005\u0012\u00030\u0096\u00010E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020b0PH\u0087\n¢\u0006\u0003\b\u009b\u0001J0\u0010S\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020b\u0012\u0005\u0012\u00030\u0096\u00010E2\u0006\u0010T\u001a\u00020U2\u0006\u0010\b\u001a\u00020bH\u0087\u0002¢\u0006\u0003\b\u009c\u0001J\u001f\u0010W\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020b\u0012\u0005\u0012\u00030\u0096\u00010EH\u0007¢\u0006\u0003\b\u009d\u0001J'\u0010J\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030\u009f\u00010E2\u0006\u0010\b\u001a\u00020UH\u0007¢\u0006\u0003\b¡\u0001J(\u0010L\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030\u009f\u00010E2\u0006\u0010\b\u001a\u00020UH\u0087\n¢\u0006\u0003\b¢\u0001J-\u0010N\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030\u009f\u00010E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020U0PH\u0007¢\u0006\u0003\b£\u0001J.\u0010L\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030\u009f\u00010E2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020U0PH\u0087\n¢\u0006\u0003\b¤\u0001J0\u0010S\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030\u009f\u00010E2\u0006\u0010T\u001a\u00020U2\u0006\u0010\b\u001a\u00020UH\u0087\u0002¢\u0006\u0003\b¥\u0001J\u001f\u0010W\u001a\u00020\u0010*\u000f\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030\u009f\u00010EH\u0007¢\u0006\u0003\b¦\u0001J\u0007\u0010¬\u0001\u001a\u00020\u0010J\u0007\u0010\u00ad\u0001\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R$\u0010 \u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R$\u0010%\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R$\u0010+\u001a\u00020*2\u0006\u0010\b\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00103\u001a\u0002022\u0006\u0010\b\u001a\u0002028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010:\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010@\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E8F¢\u0006\u0006\u001a\u0004\bH\u0010IR$\u0010Z\u001a\u00020Y2\u0006\u0010\b\u001a\u00020Y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001d\u0010a\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0E8F¢\u0006\u0006\u001a\u0004\bd\u0010IR$\u0010k\u001a\u00020Y2\u0006\u0010\b\u001a\u00020Y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010\\\"\u0004\bm\u0010^R$\u0010q\u001a\u00020p2\u0006\u0010\b\u001a\u00020p8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010v\u001a\u00020U2\u0006\u0010\b\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010|\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010\u0016\"\u0004\b~\u0010\u0018R+\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\b\u001a\u00030\u0081\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u0089\u0001\u001a\u00020U2\u0006\u0010\b\u001a\u00020U8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010x\"\u0005\b\u008b\u0001\u0010zR'\u0010\u008d\u0001\u001a\u00020U2\u0006\u0010\b\u001a\u00020U8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010x\"\u0005\b\u008f\u0001\u0010zR'\u0010\u0091\u0001\u001a\u00020U2\u0006\u0010\b\u001a\u00020U8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010x\"\u0005\b\u0093\u0001\u0010zR \u0010\u0095\u0001\u001a\u000f\u0012\u0004\u0012\u00020b\u0012\u0005\u0012\u00030\u0096\u00010E8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010IR \u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030\u009f\u00010E8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010IR)\u0010§\u0001\u001a\u00020F2\u0006\u0010\b\u001a\u00020F8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001¨\u0006³\u0001"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;)V", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "value", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "diagnosticEvents", "getDiagnosticEvents", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "setDiagnosticEvents", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;)V", "clearDiagnosticEvents", "", "hasDiagnosticEvents", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "initPolicy", "getInitPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "setInitPolicy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;)V", "clearInitPolicy", "hasInitPolicy", "adPolicy", "getAdPolicy", "setAdPolicy", "clearAdPolicy", "hasAdPolicy", "operativeEventPolicy", "getOperativeEventPolicy", "setOperativeEventPolicy", "clearOperativeEventPolicy", "hasOperativeEventPolicy", "otherPolicy", "getOtherPolicy", "setOtherPolicy", "clearOtherPolicy", "hasOtherPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "adOperations", "getAdOperations", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "setAdOperations", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;)V", "clearAdOperations", "hasAdOperations", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "setFeatureFlags", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;)V", "clearFeatureFlags", "hasFeatureFlags", "enableIapEvent", "getEnableIapEvent", "()Z", "setEnableIapEvent", "(Z)V", "clearEnableIapEvent", "enableOm", "getEnableOm", "setEnableOm", "clearEnableOm", "additionalStorePackages", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", "getAdditionalStorePackages", "()Lcom/google/protobuf/kotlin/DslList;", m.l, "addAdditionalStorePackages", "plusAssign", "plusAssignAdditionalStorePackages", "addAll", "values", "", "addAllAdditionalStorePackages", "plusAssignAllAdditionalStorePackages", "set", "index", "", "setAdditionalStorePackages", "clear", "clearAdditionalStorePackages", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "cachedAssetsConfiguration", "getCachedAssetsConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "setCachedAssetsConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;)V", "clearCachedAssetsConfiguration", "hasCachedAssetsConfiguration", "observableAndroidActivities", "Lcom/google/protobuf/ByteString;", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "getObservableAndroidActivities", "addObservableAndroidActivities", "plusAssignObservableAndroidActivities", "addAllObservableAndroidActivities", "plusAssignAllObservableAndroidActivities", "setObservableAndroidActivities", "clearObservableAndroidActivities", "cachedWebviewFilesConfiguration", "getCachedWebviewFilesConfiguration", "setCachedWebviewFilesConfiguration", "clearCachedWebviewFilesConfiguration", "hasCachedWebviewFilesConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "defaultShowCompletionState", "getDefaultShowCompletionState", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "setDefaultShowCompletionState", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;)V", "defaultShowCompletionStateValue", "getDefaultShowCompletionStateValue", "()I", "setDefaultShowCompletionStateValue", "(I)V", "clearDefaultShowCompletionState", "downloadPolicy", "getDownloadPolicy", "setDownloadPolicy", "clearDownloadPolicy", "hasDownloadPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "debugSettings", "getDebugSettings", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "setDebugSettings", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;)V", "clearDebugSettings", "hasDebugSettings", "maxExtrasSizeKb", "getMaxExtrasSizeKb", "setMaxExtrasSizeKb", "clearMaxExtrasSizeKb", "maxReceiptSizeMb", "getMaxReceiptSizeMb", "setMaxReceiptSizeMb", "clearMaxReceiptSizeMb", "overwriteIntentFlagActivity", "getOverwriteIntentFlagActivity", "setOverwriteIntentFlagActivity", "clearOverwriteIntentFlagActivity", "observableViewControllers", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableViewControllersProxy;", "getObservableViewControllers", "addObservableViewControllers", "plusAssignObservableViewControllers", "addAllObservableViewControllers", "plusAssignAllObservableViewControllers", "setObservableViewControllers", "clearObservableViewControllers", "monitoringIds", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$MonitoringIdsProxy;", "getMonitoringIds", "addMonitoringIds", "plusAssignMonitoringIds", "addAllMonitoringIds", "plusAssignAllMonitoringIds", "setMonitoringIds", "clearMonitoringIds", "levelPlayAppKey", "getLevelPlayAppKey", "()Ljava/lang/String;", "setLevelPlayAppKey", "(Ljava/lang/String;)V", "clearLevelPlayAppKey", "hasLevelPlayAppKey", "Companion", "AdditionalStorePackagesProxy", "ObservableAndroidActivitiesProxy", "ObservableViewControllersProxy", "MonitoringIdsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: NativeConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            Intrinsics.checkNotNullExpressionValue(diagnosticEvents, "getDiagnosticEvents(...)");
            return diagnosticEvents;
        }

        public final void setDiagnosticEvents(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDiagnosticEvents(value);
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            Intrinsics.checkNotNullExpressionValue(initPolicy, "getInitPolicy(...)");
            return initPolicy;
        }

        public final void setInitPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInitPolicy(value);
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            Intrinsics.checkNotNullExpressionValue(adPolicy, "getAdPolicy(...)");
            return adPolicy;
        }

        public final void setAdPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdPolicy(value);
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            Intrinsics.checkNotNullExpressionValue(operativeEventPolicy, "getOperativeEventPolicy(...)");
            return operativeEventPolicy;
        }

        public final void setOperativeEventPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOperativeEventPolicy(value);
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            Intrinsics.checkNotNullExpressionValue(otherPolicy, "getOtherPolicy(...)");
            return otherPolicy;
        }

        public final void setOtherPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOtherPolicy(value);
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        @NotNull
        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            Intrinsics.checkNotNullExpressionValue(adOperations, "getAdOperations(...)");
            return adOperations;
        }

        public final void setAdOperations(@NotNull NativeConfigurationOuterClass.AdOperationsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdOperations(value);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        @NotNull
        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            Intrinsics.checkNotNullExpressionValue(featureFlags, "getFeatureFlags(...)");
            return featureFlags;
        }

        public final void setFeatureFlags(@NotNull NativeConfigurationOuterClass.FeatureFlags value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFeatureFlags(value);
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        /* compiled from: NativeConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        @NotNull
        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            Intrinsics.checkNotNullExpressionValue(additionalStorePackagesList, "getAdditionalStorePackagesList(...)");
            return new DslList<>(additionalStorePackagesList);
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addAdditionalStorePackages(value);
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addAdditionalStorePackages(dslList, value);
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllAdditionalStorePackages(values);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllAdditionalStorePackages(dslList, values);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdditionalStorePackages(i, value);
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        @NotNull
        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            Intrinsics.checkNotNullExpressionValue(cachedAssetsConfiguration, "getCachedAssetsConfiguration(...)");
            return cachedAssetsConfiguration;
        }

        public final void setCachedAssetsConfiguration(@NotNull NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCachedAssetsConfiguration(value);
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        /* compiled from: NativeConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List<ByteString> observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            Intrinsics.checkNotNullExpressionValue(observableAndroidActivitiesList, "getObservableAndroidActivitiesList(...)");
            return new DslList(observableAndroidActivitiesList);
        }

        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addObservableAndroidActivities(value);
        }

        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addObservableAndroidActivities(dslList, value);
        }

        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllObservableAndroidActivities(values);
        }

        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, Iterable<? extends ByteString> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllObservableAndroidActivities(dslList, values);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setObservableAndroidActivities(i, value);
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        @NotNull
        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            Intrinsics.checkNotNullExpressionValue(cachedWebviewFilesConfiguration, "getCachedWebviewFilesConfiguration(...)");
            return cachedWebviewFilesConfiguration;
        }

        public final void setCachedWebviewFilesConfiguration(@NotNull NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCachedWebviewFilesConfiguration(value);
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        @NotNull
        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            Intrinsics.checkNotNullExpressionValue(defaultShowCompletionState, "getDefaultShowCompletionState(...)");
            return defaultShowCompletionState;
        }

        public final void setDefaultShowCompletionState(@NotNull NativeConfigurationOuterClass.ShowCompletionState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDefaultShowCompletionState(value);
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final void setDefaultShowCompletionStateValue(int i) {
            this._builder.setDefaultShowCompletionStateValue(i);
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            Intrinsics.checkNotNullExpressionValue(downloadPolicy, "getDownloadPolicy(...)");
            return downloadPolicy;
        }

        public final void setDownloadPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDownloadPolicy(value);
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        @NotNull
        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            Intrinsics.checkNotNullExpressionValue(debugSettings, "getDebugSettings(...)");
            return debugSettings;
        }

        public final void setDebugSettings(@NotNull NativeConfigurationOuterClass.DebugSettings value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDebugSettings(value);
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final int getMaxExtrasSizeKb() {
            return this._builder.getMaxExtrasSizeKb();
        }

        public final void setMaxExtrasSizeKb(int i) {
            this._builder.setMaxExtrasSizeKb(i);
        }

        public final void clearMaxExtrasSizeKb() {
            this._builder.clearMaxExtrasSizeKb();
        }

        public final int getMaxReceiptSizeMb() {
            return this._builder.getMaxReceiptSizeMb();
        }

        public final void setMaxReceiptSizeMb(int i) {
            this._builder.setMaxReceiptSizeMb(i);
        }

        public final void clearMaxReceiptSizeMb() {
            this._builder.clearMaxReceiptSizeMb();
        }

        public final int getOverwriteIntentFlagActivity() {
            return this._builder.getOverwriteIntentFlagActivity();
        }

        public final void setOverwriteIntentFlagActivity(int i) {
            this._builder.setOverwriteIntentFlagActivity(i);
        }

        public final void clearOverwriteIntentFlagActivity() {
            this._builder.clearOverwriteIntentFlagActivity();
        }

        /* compiled from: NativeConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableViewControllersProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ObservableViewControllersProxy extends DslProxy {
            private ObservableViewControllersProxy() {
            }
        }

        public final /* synthetic */ DslList getObservableViewControllers() {
            List<ByteString> observableViewControllersList = this._builder.getObservableViewControllersList();
            Intrinsics.checkNotNullExpressionValue(observableViewControllersList, "getObservableViewControllersList(...)");
            return new DslList(observableViewControllersList);
        }

        public final /* synthetic */ void addObservableViewControllers(DslList dslList, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addObservableViewControllers(value);
        }

        public final /* synthetic */ void plusAssignObservableViewControllers(DslList<ByteString, ObservableViewControllersProxy> dslList, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addObservableViewControllers(dslList, value);
        }

        public final /* synthetic */ void addAllObservableViewControllers(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllObservableViewControllers(values);
        }

        public final /* synthetic */ void plusAssignAllObservableViewControllers(DslList<ByteString, ObservableViewControllersProxy> dslList, Iterable<? extends ByteString> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllObservableViewControllers(dslList, values);
        }

        public final /* synthetic */ void setObservableViewControllers(DslList dslList, int i, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setObservableViewControllers(i, value);
        }

        public final /* synthetic */ void clearObservableViewControllers(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearObservableViewControllers();
        }

        /* compiled from: NativeConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$MonitoringIdsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MonitoringIdsProxy extends DslProxy {
            private MonitoringIdsProxy() {
            }
        }

        public final /* synthetic */ DslList getMonitoringIds() {
            List<Integer> monitoringIdsList = this._builder.getMonitoringIdsList();
            Intrinsics.checkNotNullExpressionValue(monitoringIdsList, "getMonitoringIdsList(...)");
            return new DslList(monitoringIdsList);
        }

        public final /* synthetic */ void addMonitoringIds(DslList dslList, int i) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.addMonitoringIds(i);
        }

        public final /* synthetic */ void plusAssignMonitoringIds(DslList<Integer, MonitoringIdsProxy> dslList, int i) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            addMonitoringIds(dslList, i);
        }

        public final /* synthetic */ void addAllMonitoringIds(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllMonitoringIds(values);
        }

        public final /* synthetic */ void plusAssignAllMonitoringIds(DslList<Integer, MonitoringIdsProxy> dslList, Iterable<Integer> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllMonitoringIds(dslList, values);
        }

        public final /* synthetic */ void setMonitoringIds(DslList dslList, int i, int i2) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.setMonitoringIds(i, i2);
        }

        public final /* synthetic */ void clearMonitoringIds(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearMonitoringIds();
        }

        @NotNull
        public final String getLevelPlayAppKey() {
            String levelPlayAppKey = this._builder.getLevelPlayAppKey();
            Intrinsics.checkNotNullExpressionValue(levelPlayAppKey, "getLevelPlayAppKey(...)");
            return levelPlayAppKey;
        }

        public final void setLevelPlayAppKey(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLevelPlayAppKey(value);
        }

        public final void clearLevelPlayAppKey() {
            this._builder.clearLevelPlayAppKey();
        }

        public final boolean hasLevelPlayAppKey() {
            return this._builder.hasLevelPlayAppKey();
        }
    }
}
