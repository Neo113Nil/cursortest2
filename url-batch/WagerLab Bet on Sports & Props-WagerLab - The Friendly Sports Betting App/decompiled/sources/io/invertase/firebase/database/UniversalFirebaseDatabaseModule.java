package io.invertase.firebase.database;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.invertase.firebase.common.UniversalFirebaseModule;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class UniversalFirebaseDatabaseModule extends UniversalFirebaseModule {
    UniversalFirebaseDatabaseModule(Context context, String str) {
        super(context, str);
    }

    Task<Void> goOnline(final String str, final String str2) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.database.UniversalFirebaseDatabaseModule$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UniversalFirebaseDatabaseModule.lambda$goOnline$0(str, str2);
            }
        });
    }

    static /* synthetic */ Void lambda$goOnline$0(String str, String str2) throws Exception {
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).goOnline();
        return null;
    }

    Task<Void> goOffline(final String str, final String str2) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.database.UniversalFirebaseDatabaseModule$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UniversalFirebaseDatabaseModule.lambda$goOffline$1(str, str2);
            }
        });
    }

    static /* synthetic */ Void lambda$goOffline$1(String str, String str2) throws Exception {
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).goOffline();
        return null;
    }
}
