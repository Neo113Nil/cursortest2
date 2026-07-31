package io.invertase.firebase.database;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import io.invertase.firebase.common.UniversalFirebaseModule;
import java.util.Map;

/* loaded from: classes8.dex */
public class UniversalFirebaseDatabaseReferenceModule extends UniversalFirebaseModule {
    UniversalFirebaseDatabaseReferenceModule(Context context, String str) {
        super(context, str);
    }

    Task<Void> set(String str, String str2, String str3, Object obj) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3).setValue(obj, new DatabaseReference.CompletionListener() { // from class: io.invertase.firebase.database.UniversalFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda1
            @Override // com.google.firebase.database.DatabaseReference.CompletionListener
            public final void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                UniversalFirebaseDatabaseReferenceModule.lambda$set$0(TaskCompletionSource.this, databaseError, databaseReference);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$set$0(TaskCompletionSource taskCompletionSource, DatabaseError databaseError, DatabaseReference databaseReference) {
        if (databaseError != null) {
            taskCompletionSource.setException(new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    Task<Void> update(String str, String str2, String str3, Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3).updateChildren(map, new DatabaseReference.CompletionListener() { // from class: io.invertase.firebase.database.UniversalFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda3
            @Override // com.google.firebase.database.DatabaseReference.CompletionListener
            public final void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                UniversalFirebaseDatabaseReferenceModule.lambda$update$1(TaskCompletionSource.this, databaseError, databaseReference);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$update$1(TaskCompletionSource taskCompletionSource, DatabaseError databaseError, DatabaseReference databaseReference) {
        if (databaseError != null) {
            taskCompletionSource.setException(new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    Task<Void> setWithPriority(String str, String str2, String str3, Object obj, Object obj2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3).setValue(obj, obj2, new DatabaseReference.CompletionListener() { // from class: io.invertase.firebase.database.UniversalFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda2
            @Override // com.google.firebase.database.DatabaseReference.CompletionListener
            public final void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                UniversalFirebaseDatabaseReferenceModule.lambda$setWithPriority$2(TaskCompletionSource.this, databaseError, databaseReference);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$setWithPriority$2(TaskCompletionSource taskCompletionSource, DatabaseError databaseError, DatabaseReference databaseReference) {
        if (databaseError != null) {
            taskCompletionSource.setException(new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    Task<Void> remove(String str, String str2, String str3) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3).removeValue(new DatabaseReference.CompletionListener() { // from class: io.invertase.firebase.database.UniversalFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda0
            @Override // com.google.firebase.database.DatabaseReference.CompletionListener
            public final void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                UniversalFirebaseDatabaseReferenceModule.lambda$remove$3(TaskCompletionSource.this, databaseError, databaseReference);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$remove$3(TaskCompletionSource taskCompletionSource, DatabaseError databaseError, DatabaseReference databaseReference) {
        if (databaseError != null) {
            taskCompletionSource.setException(new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    Task<Void> setPriority(String str, String str2, String str3, Object obj) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3).setPriority(obj, new DatabaseReference.CompletionListener() { // from class: io.invertase.firebase.database.UniversalFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda4
            @Override // com.google.firebase.database.DatabaseReference.CompletionListener
            public final void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                UniversalFirebaseDatabaseReferenceModule.lambda$setPriority$4(TaskCompletionSource.this, databaseError, databaseReference);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$setPriority$4(TaskCompletionSource taskCompletionSource, DatabaseError databaseError, DatabaseReference databaseReference) {
        if (databaseError != null) {
            taskCompletionSource.setException(new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }
}
