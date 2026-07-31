package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import com.google.android.gms.common.Scopes;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.logging.Severity;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JvmStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPreCreationProfileRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "", "context", "Landroid/content/Context;", "defaultProfile", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "(Landroid/content/Context;Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;)V", "get", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", Scopes.PROFILE, "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ViewPreCreationProfileSerializer", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes15.dex */
public class ViewPreCreationProfileRepository {

    @Deprecated
    @NotNull
    public static final String STORE_PATH = "divkit_optimized_viewpool_profile_%s.json";

    @Deprecated
    @NotNull
    public static final String TAG = "OptimizedViewPreCreationProfileRepository";

    @NotNull
    private final Context context;

    @NotNull
    private final ViewPreCreationProfile defaultProfile;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = new WeakHashMap<>();

    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation continuation) {
        return get$suspendImpl(this, str, continuation);
    }

    @Nullable
    public Object save(@NotNull ViewPreCreationProfile viewPreCreationProfile, @NotNull Continuation continuation) {
        return save$suspendImpl(this, viewPreCreationProfile, continuation);
    }

    public ViewPreCreationProfileRepository(@NotNull Context context, @NotNull ViewPreCreationProfile viewPreCreationProfile) {
        this.context = context;
        this.defaultProfile = viewPreCreationProfile;
    }

    static /* synthetic */ Object get$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ViewPreCreationProfileRepository$get$2(viewPreCreationProfileRepository, str, null), continuation);
    }

    static /* synthetic */ Object save$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, ViewPreCreationProfile viewPreCreationProfile, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ViewPreCreationProfileRepository$save$2(viewPreCreationProfileRepository, viewPreCreationProfile, null), continuation);
    }

    /* compiled from: ViewPreCreationProfileRepository.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "()V", "defaultValue", "getDefaultValue", "()Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", PreferencesSerializer.fileExtension, "Lkotlinx/serialization/json/Json;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ViewPreCreationProfileSerializer implements Serializer<ViewPreCreationProfile> {

        @Nullable
        private static final ViewPreCreationProfile defaultValue = null;

        @NotNull
        public static final ViewPreCreationProfileSerializer INSTANCE = new ViewPreCreationProfileSerializer();

        @NotNull
        private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JsonBuilder) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull JsonBuilder jsonBuilder) {
                jsonBuilder.setEncodeDefaults(false);
            }
        }, 1, null);

        private ViewPreCreationProfileSerializer() {
        }

        @Override // androidx.datastore.core.Serializer
        @Nullable
        public ViewPreCreationProfile getDefaultValue() {
            return defaultValue;
        }

        @Override // androidx.datastore.core.Serializer
        @Nullable
        public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) {
            Object m8023constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                Json json2 = json;
                m8023constructorimpl = Result.m8023constructorimpl((ViewPreCreationProfile) JvmStreamsKt.decodeFromStream(json2, SerializersKt.serializer(json2.getSerializersModule(), Reflection.nullableTypeOf(ViewPreCreationProfile.class)), inputStream));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e(ViewPreCreationProfileRepository.TAG, "", m8026exceptionOrNullimpl);
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                return null;
            }
            return m8023constructorimpl;
        }

        @Override // androidx.datastore.core.Serializer
        @Nullable
        public Object writeTo(@Nullable ViewPreCreationProfile viewPreCreationProfile, @NotNull OutputStream outputStream, @NotNull Continuation continuation) {
            Object m8023constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                Json json2 = json;
                JvmStreamsKt.encodeToStream(json2, SerializersKt.serializer(json2.getSerializersModule(), Reflection.nullableTypeOf(ViewPreCreationProfile.class)), viewPreCreationProfile, outputStream);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e(ViewPreCreationProfileRepository.TAG, "", m8026exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewPreCreationProfileRepository.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository$Companion;", "", "()V", "STORE_PATH", "", "TAG", "stores", "Ljava/util/WeakHashMap;", "Landroidx/datastore/core/DataStore;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "getStores", "()Ljava/util/WeakHashMap;", "getStoreForId", "Landroid/content/Context;", "id", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final WeakHashMap<String, DataStore<ViewPreCreationProfile>> getStores() {
            return ViewPreCreationProfileRepository.stores;
        }

        @NotNull
        public final DataStore<ViewPreCreationProfile> getStoreForId(@NotNull final Context context, @NotNull final String str) {
            WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = getStores();
            DataStore<ViewPreCreationProfile> dataStore = stores.get(str);
            if (dataStore == null) {
                dataStore = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, ViewPreCreationProfileSerializer.INSTANCE, null, null, null, new Function0() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$Companion$getStoreForId$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final File mo4828invoke() {
                        File filesDir = context.getFilesDir();
                        String format = String.format(ViewPreCreationProfileRepository.STORE_PATH, Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return new File(filesDir, format);
                    }
                }, 14, null);
                stores.put(str, dataStore);
            }
            return dataStore;
        }
    }
}
