package com.yandex.div.storage.database;

import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.RawDataAndMetadata;
import com.yandex.div.storage.rawjson.RawJson;
import com.yandex.div.storage.templates.Template;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleTransactionDataSavePerformer.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006\""}, d2 = {"Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "storageStatementsExecutor", "<init>", "(Lcom/yandex/div/storage/database/StorageStatementExecutor;)V", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lkotlin/Function1;", "", "Lcom/yandex/div/storage/database/StorageStatement;", "", "statementsBuilder", "Lcom/yandex/div/storage/database/ExecutionResult;", "executeStatements", "(Lcom/yandex/div/storage/DivDataRepository$ActionOnError;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/ExecutionResult;", "", NotificationCategory.GROUP_ID_KEY, "", "Lcom/yandex/div/storage/RawDataAndMetadata;", StorageSchema.TABLE_CARDS, "createCardsSaveStatement", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/div/storage/database/StorageStatement;", "Lcom/yandex/div/storage/rawjson/RawJson;", "rawJsons", "createRawJsonsSaveStatement", "(Ljava/util/List;)Lcom/yandex/div/storage/database/StorageStatement;", "Lcom/yandex/div/storage/templates/Template;", "templatesByHash", "saveDivData", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/database/ExecutionResult;", "saveRawJsons", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/database/ExecutionResult;", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SingleTransactionDataSavePerformer {

    @NotNull
    private final StorageStatementExecutor storageStatementsExecutor;

    public SingleTransactionDataSavePerformer(@NotNull StorageStatementExecutor storageStatementExecutor) {
        this.storageStatementsExecutor = storageStatementExecutor;
    }

    @NotNull
    public final ExecutionResult saveDivData(@NotNull final String groupId, @NotNull final List<? extends RawDataAndMetadata> cards, @NotNull final List<Template> templatesByHash, @NotNull DivDataRepository.ActionOnError actionOnError) throws IOException {
        return executeStatements(actionOnError, new Function1() { // from class: com.yandex.div.storage.database.SingleTransactionDataSavePerformer$saveDivData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<StorageStatement>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<StorageStatement> list) {
                StorageStatement createCardsSaveStatement;
                StorageStatements storageStatements = StorageStatements.INSTANCE;
                list.add(storageStatements.writeTemplatesUsages(groupId, templatesByHash));
                createCardsSaveStatement = this.createCardsSaveStatement(groupId, cards);
                list.add(createCardsSaveStatement);
                list.add(storageStatements.writeTemplates(templatesByHash));
                list.add(storageStatements.deleteTemplatesWithoutLinksToCards());
            }
        });
    }

    @NotNull
    public final ExecutionResult saveRawJsons(@NotNull final List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError) throws IOException {
        return executeStatements(actionOnError, new Function1() { // from class: com.yandex.div.storage.database.SingleTransactionDataSavePerformer$saveRawJsons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<StorageStatement>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<StorageStatement> list) {
                StorageStatement createRawJsonsSaveStatement;
                createRawJsonsSaveStatement = SingleTransactionDataSavePerformer.this.createRawJsonsSaveStatement(rawJsons);
                list.add(createRawJsonsSaveStatement);
            }
        });
    }

    static /* synthetic */ ExecutionResult executeStatements$default(SingleTransactionDataSavePerformer singleTransactionDataSavePerformer, DivDataRepository.ActionOnError actionOnError, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            actionOnError = DivDataRepository.ActionOnError.ABORT_TRANSACTION;
        }
        return singleTransactionDataSavePerformer.executeStatements(actionOnError, function1);
    }

    private final ExecutionResult executeStatements(DivDataRepository.ActionOnError actionOnError, Function1 statementsBuilder) {
        ArrayList arrayList = new ArrayList();
        statementsBuilder.invoke(arrayList);
        StorageStatementExecutor storageStatementExecutor = this.storageStatementsExecutor;
        StorageStatement[] storageStatementArr = (StorageStatement[]) arrayList.toArray(new StorageStatement[0]);
        return storageStatementExecutor.execute(actionOnError, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageStatement createCardsSaveStatement(String groupId, List<? extends RawDataAndMetadata> cards) {
        return StorageStatements.replaceCards$default(StorageStatements.INSTANCE, groupId, cards, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageStatement createRawJsonsSaveStatement(List<? extends RawJson> rawJsons) {
        return StorageStatements.replaceRawJsons$default(StorageStatements.INSTANCE, rawJsons, null, 2, null);
    }
}
