package com.yandex.div.storage;

import android.content.Context;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.LazyProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStorageComponent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivStorageComponent;", "", "rawJsonRepository", "Lcom/yandex/div/storage/RawJsonRepository;", "getRawJsonRepository", "()Lcom/yandex/div/storage/RawJsonRepository;", "repository", "Lcom/yandex/div/storage/DivDataRepository;", "getRepository", "()Lcom/yandex/div/storage/DivDataRepository;", "Companion", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DivStorageComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    RawJsonRepository getRawJsonRepository();

    @NotNull
    DivDataRepository getRepository();

    /* compiled from: DivStorageComponent.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007Jc\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/storage/DivStorageComponent$Companion;", "", "()V", "create", "Lcom/yandex/div/storage/DivStorageComponent;", "context", "Landroid/content/Context;", "histogramReporter", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "histogramNameProvider", "Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "errorLogger", "Lcom/yandex/div/json/ParsingErrorLogger;", "cardErrorTransformer", "Ljavax/inject/Provider;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "parsingHistogramReporter", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "databaseNamePrefix", "", "createInternal", "Lcom/yandex/div/storage/InternalStorageComponent;", "createInternal$div_storage_release", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public final DivStorageComponent create(@NotNull Context context) {
            return create$default(this, context, null, null, null, null, null, null, 126, null);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate) {
            return create$default(this, context, histogramReporterDelegate, null, null, null, null, null, 124, null);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider) {
            return create$default(this, context, histogramReporterDelegate, histogramNameProvider, null, null, null, null, 120, null);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger parsingErrorLogger) {
            return create$default(this, context, histogramReporterDelegate, histogramNameProvider, parsingErrorLogger, null, null, null, 112, null);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger parsingErrorLogger, @Nullable Provider provider) {
            return create$default(this, context, histogramReporterDelegate, histogramNameProvider, parsingErrorLogger, provider, null, null, 96, null);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger parsingErrorLogger, @Nullable Provider provider, @NotNull Provider provider2) {
            return create$default(this, context, histogramReporterDelegate, histogramNameProvider, parsingErrorLogger, provider, provider2, null, 64, null);
        }

        private Companion() {
        }

        public static /* synthetic */ DivStorageComponent create$default(Companion companion, Context context, HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider, ParsingErrorLogger parsingErrorLogger, Provider provider, Provider provider2, String str, int i, Object obj) {
            return companion.create(context, (i & 2) != 0 ? HistogramReporterDelegate.NoOp.INSTANCE : histogramReporterDelegate, (i & 4) != 0 ? null : histogramNameProvider, (i & 8) != 0 ? ParsingErrorLogger.LOG : parsingErrorLogger, (i & 16) == 0 ? provider : null, (i & 32) != 0 ? new LazyProvider(new Function0() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$create$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final DivParsingHistogramReporter mo4828invoke() {
                    return DivParsingHistogramReporter.INSTANCE.getDEFAULT();
                }
            }) : provider2, (i & 64) != 0 ? "" : str);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable Provider cardErrorTransformer, @NotNull Provider parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            return createInternal$div_storage_release(context, histogramReporter, histogramNameProvider, errorLogger, cardErrorTransformer, parsingHistogramReporter, databaseNamePrefix);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatabaseOpenHelper createInternal$lambda$0(Context context, String str, int i, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
            return new AndroidDatabaseOpenHelper(context, str, i, createCallback, upgradeCallback);
        }

        @NotNull
        public final InternalStorageComponent createInternal$div_storage_release(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable Provider cardErrorTransformer, @NotNull final Provider parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new DatabaseOpenHelperProvider() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$$ExternalSyntheticLambda0
                @Override // com.yandex.div.storage.database.DatabaseOpenHelperProvider
                public final DatabaseOpenHelper provide(Context context2, String str, int i, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
                    DatabaseOpenHelper createInternal$lambda$0;
                    createInternal$lambda$0 = DivStorageComponent.Companion.createInternal$lambda$0(context2, str, i, createCallback, upgradeCallback);
                    return createInternal$lambda$0;
                }
            }, databaseNamePrefix);
            LazyProvider lazyProvider = new LazyProvider(new Function0() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final DivParsingHistogramProxy mo4828invoke() {
                    final Provider provider = Provider.this;
                    return new DivParsingHistogramProxy(new Function0() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final DivParsingHistogramReporter mo4828invoke() {
                            return (DivParsingHistogramReporter) Provider.this.get();
                        }
                    });
                }
            });
            HistogramRecorder histogramRecorder = new HistogramRecorder(histogramReporter, histogramNameProvider);
            TemplatesContainer templatesContainer = new TemplatesContainer(divStorageImpl, errorLogger, histogramRecorder, lazyProvider, histogramNameProvider);
            return new InternalStorageComponent(new DivDataRepositoryImpl(divStorageImpl, templatesContainer, histogramRecorder, histogramNameProvider, lazyProvider, new CardErrorLoggerFactory(cardErrorTransformer, templatesContainer, errorLogger)), new RawJsonRepositoryImpl(divStorageImpl), divStorageImpl);
        }
    }
}
