package com.yandex.div.storage.database;

import android.database.SQLException;
import androidx.annotation.AnyThread;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* compiled from: StorageStatementExecutor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0007¢\u0006\u0002\u0010\rJ!\u0010\u0006\u001a\u00020\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0007¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/storage/database/StorageStatementExecutor;", "", "dbProvider", "Lkotlin/Function0;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "(Lkotlin/jvm/functions/Function0;)V", "execute", "Lcom/yandex/div/storage/database/ExecutionResult;", "actionOnError", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "statements", "", "Lcom/yandex/div/storage/database/StorageStatement;", "(Lcom/yandex/div/storage/DivDataRepository$ActionOnError;[Lcom/yandex/div/storage/database/StorageStatement;)Lcom/yandex/div/storage/database/ExecutionResult;", "([Lcom/yandex/div/storage/database/StorageStatement;)Lcom/yandex/div/storage/database/ExecutionResult;", "throwWithLogging", "", "message", "", TelemetryCategory.EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StorageStatementExecutor {

    @NotNull
    private final Function0 dbProvider;

    /* compiled from: StorageStatementExecutor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.ActionOnError.values().length];
            try {
                iArr[DivDataRepository.ActionOnError.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.ActionOnError.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StorageStatementExecutor(@NotNull Function0 function0) {
        this.dbProvider = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        if (r15 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r15 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.yandex.div.storage.database.StorageStatement] */
    @AnyThread
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExecutionResult execute(@NotNull DivDataRepository.ActionOnError actionOnError, @NotNull StorageStatement... statements) throws SQLException {
        ClosableSqlCompiler closableSqlCompiler;
        IllegalStateException illegalStateException;
        DatabaseOpenHelper.Database database;
        ClosableSqlCompiler closableSqlCompiler2;
        SQLException sQLException;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ArrayList arrayList = new ArrayList();
        DatabaseOpenHelper.Database database2 = null;
        try {
            try {
                database = (DatabaseOpenHelper.Database) this.dbProvider.mo4828invoke();
                try {
                    ClosableSqlCompiler closableSqlCompiler3 = new ClosableSqlCompiler(database);
                    try {
                        database.beginTransaction();
                        int length = statements.length;
                        int i = 0;
                        while (i < length) {
                            ?? r5 = statements[i];
                            ref$ObjectRef.element = r5;
                            int i2 = i;
                            int i3 = length;
                            closableSqlCompiler2 = closableSqlCompiler3;
                            try {
                                execute$executeCatchingSqlException(ref$ObjectRef, ref$IntRef, statements, actionOnError, this, arrayList, closableSqlCompiler3, r5);
                                ref$IntRef.element++;
                                i = i2 + 1;
                                length = i3;
                                closableSqlCompiler3 = closableSqlCompiler2;
                            } catch (SQLException e) {
                                e = e;
                                sQLException = e;
                                arrayList.add(new DivStorageErrorException("Error during statements execution.", sQLException, null, 4, null));
                                if (database != null) {
                                    SqlExtensionsKt.endTransactionSilently(database);
                                }
                                if (closableSqlCompiler2 != null) {
                                    closableSqlCompiler2.close();
                                }
                            } catch (IllegalStateException e2) {
                                e = e2;
                                illegalStateException = e;
                                arrayList.add(new DivStorageErrorException("Error during statements execution.", illegalStateException, null, 4, null));
                                if (database != null) {
                                    SqlExtensionsKt.endTransactionSilently(database);
                                }
                                if (closableSqlCompiler2 != null) {
                                    closableSqlCompiler2.close();
                                }
                            }
                        }
                        closableSqlCompiler2 = closableSqlCompiler3;
                        database.setTransactionSuccessful();
                        SqlExtensionsKt.endTransactionSilently(database);
                        closableSqlCompiler2.close();
                    } catch (SQLException e3) {
                        e = e3;
                        closableSqlCompiler2 = closableSqlCompiler3;
                    } catch (IllegalStateException e4) {
                        e = e4;
                        closableSqlCompiler2 = closableSqlCompiler3;
                    } catch (Throwable th) {
                        th = th;
                        closableSqlCompiler = closableSqlCompiler3;
                        database2 = database;
                        if (database2 != null) {
                            SqlExtensionsKt.endTransactionSilently(database2);
                        }
                        if (closableSqlCompiler != null) {
                            closableSqlCompiler.close();
                        }
                        if (database2 != null) {
                            SqlExtensionsKt.closeSilently(database2);
                        }
                        throw th;
                    }
                } catch (SQLException e5) {
                    sQLException = e5;
                    closableSqlCompiler2 = null;
                } catch (IllegalStateException e6) {
                    illegalStateException = e6;
                    closableSqlCompiler2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    closableSqlCompiler = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLException e7) {
            sQLException = e7;
            database = null;
            closableSqlCompiler2 = null;
        } catch (IllegalStateException e8) {
            illegalStateException = e8;
            database = null;
            closableSqlCompiler2 = null;
        } catch (Throwable th4) {
            th = th4;
            closableSqlCompiler = null;
            if (database2 != null) {
            }
            if (closableSqlCompiler != null) {
            }
            if (database2 != null) {
            }
            throw th;
        }
        SqlExtensionsKt.closeSilently(database);
        return new ExecutionResult(arrayList);
    }

    private static final void execute$handleException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, Exception exc) {
        String str = "Exception at statement '" + ref$ObjectRef.element + "' (" + ref$IntRef.element + " out " + storageStatementArr.length + ')';
        int i = WhenMappings.$EnumSwitchMapping$0[actionOnError.ordinal()];
        if (i == 1) {
            storageStatementExecutor.throwWithLogging(str, exc);
            throw new KotlinNothingValueException();
        }
        if (i != 2) {
            return;
        }
        list.add(new DivStorageErrorException(str, exc, null, 4, null));
    }

    private static final void execute$executeCatchingSqlException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, ClosableSqlCompiler closableSqlCompiler, StorageStatement storageStatement) {
        try {
            storageStatement.execute(closableSqlCompiler);
        } catch (SQLException e) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, e);
        } catch (IllegalStateException e2) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, e2);
        }
    }

    @AnyThread
    @NotNull
    public final ExecutionResult execute(@NotNull StorageStatement... statements) throws SQLException {
        return execute(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(statements, statements.length));
    }

    private final Void throwWithLogging(String message, Exception exception) throws SQLException {
        throw new SQLException(message, exception);
    }
}
