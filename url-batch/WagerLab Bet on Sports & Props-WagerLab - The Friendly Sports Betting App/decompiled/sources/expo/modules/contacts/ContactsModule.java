package expo.modules.contacts;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.ContactsContract;
import androidx.tracing.Trace;
import com.amazon.a.a.o.b;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.actions.SearchIntents;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.BirthdayModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: ContactsModule.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J&\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010%H\u0002J\"\u0010)\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+H\u0002J*\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+2\b\u0010/\u001a\u0004\u0018\u00010%H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010-2\u0006\u00101\u001a\u000202H\u0002J\u0016\u00103\u001a\u0002042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+H\u0002JQ\u00105\u001a\u0004\u0018\u00010-2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+2\b\u0010/\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010<J:\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u001a0>j\b\u0012\u0004\u0012\u00020\u001a`?2\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u001a0>j\b\u0012\u0004\u0012\u00020\u001a`?2\b\u0010/\u001a\u0004\u0018\u00010%H\u0002J\u001c\u0010A\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020\u0018H\u0002J\b\u0010E\u001a\u00020\u0018H\u0002J\b\u0010F\u001a\u00020\u0018H\u0002J\b\u0010G\u001a\u00020\u0018H\u0002J\b\u0010H\u001a\u00020\u0018H\u0002J\b\u0010I\u001a\u00020\u0018H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006J"}, d2 = {"Lexpo/modules/contacts/ContactsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "contactPickingPromise", "Lexpo/modules/kotlin/Promise;", "contactManipulationPromise", "contactChangeObserver", "Landroid/database/ContentObserver;", "contactsHandlerThread", "Landroid/os/HandlerThread;", "contactsHandler", "Landroid/os/Handler;", "permissionsManager", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "presentForm", "", "contact", "Lexpo/modules/contacts/Contact;", BaseJavaModule.METHOD_TYPE_PROMISE, "presentEditForm", "resolver", "Landroid/content/ContentResolver;", "getResolver", "()Landroid/content/ContentResolver;", "mutateContact", "initContact", "data", "", "", "", "getLookupKeyForContactId", "contactId", "getContactById", "keysToFetch", "", "getContactByName", "Lexpo/modules/contacts/ContactPage;", SearchIntents.EXTRA_QUERY, SDKConstants.PARAM_SORT_ORDER, "getAllContactsAsync", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/contacts/ContactQuery;", "createProjectionForQuery", "Lexpo/modules/contacts/QueryArguments;", "fetchContacts", "pageOffset", "", "pageSize", "queryStrings", "", "initQueryField", "(II[Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Lexpo/modules/contacts/ContactPage;", "sortContactsBy", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", MetricTracker.Object.INPUT, "loadContactsFrom", b.b, "Landroid/database/Cursor;", "ensureReadPermission", "ensureWritePermission", "ensurePermissions", "startObservingContactChanges", "stopObservingContactChanges", "handleContactChange", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContactsModule extends Module {
    private ContentObserver contactChangeObserver;
    private Promise contactManipulationPromise;
    private Promise contactPickingPromise;
    private Handler contactsHandler;
    private HandlerThread contactsHandlerThread;

    /* JADX INFO: Access modifiers changed from: private */
    public final Permissions getPermissionsManager() {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new Exceptions.PermissionsModuleNotFound();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getCurrentActivity() {
        return getAppContext().getThrowingActivity();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent3;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent4;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent5;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent6;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent7;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent8;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent5;
        ContactsModule contactsModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (contactsModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(contactsModule);
            moduleDefinitionBuilder.Name("ExpoContacts");
            moduleDefinitionBuilder.Events(ContactsModuleKt.onContactsChangeEventName);
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsModule.this.stopObservingContactChanges();
                }
            }));
            moduleDefinitionBuilder.OnStartObserving(ContactsModuleKt.onContactsChangeEventName, new Function0<Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$1$2
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsModule.this.ensureReadPermission();
                    ContactsModule.this.startObservingContactChanges();
                }
            });
            moduleDefinitionBuilder.OnStopObserving(ContactsModuleKt.onContactsChangeEventName, new Function0<Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$1$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsModule.this.stopObservingContactChanges();
                }
            });
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters);
                }
                anyTypeArr[0] = anyType;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
                                } else {
                                    untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("requestPermissionsAsync", asyncFunctionWithPromiseComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
                AnyType[] anyTypeArr2 = new AnyType[1];
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters2);
                }
                anyTypeArr2[0] = anyType2;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent2 = new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
                                } else {
                                    untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
                                }
                            } else {
                                untypedAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
                            }
                        } else {
                            untypedAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
                        }
                    } else {
                        untypedAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
                    }
                } else {
                    untypedAsyncFunctionComponent2 = new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
                }
                asyncFunctionWithPromiseComponent2 = untypedAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("getPermissionsAsync", asyncFunctionWithPromiseComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            TypeConverterProvider converters3 = moduleDefinitionBuilder4.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[1];
            AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQuery.class), false));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ContactQuery.class), false, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ContactQuery.class);
                    }
                }), converters3);
            }
            anyTypeArr3[0] = anyType3;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent6 = new AsyncFunctionWithPromiseComponent("getContactsAsync", anyTypeArr3, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    ContactQuery contactQuery = (ContactQuery) objArr[0];
                    ContactsModule.this.ensureReadPermission();
                    BuildersKt__Builders_commonKt.launch$default(ContactsModule.this.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$6$1(contactQuery, promise, ContactsModule.this, null), 3, null);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder4.getAsyncFunctions().put("getContactsAsync", asyncFunctionWithPromiseComponent6);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent7 = asyncFunctionWithPromiseComponent6;
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            TypeConverterProvider converters4 = moduleDefinitionBuilder5.getConverters();
            AnyType[] anyTypeArr4 = new AnyType[2];
            AnyType anyType4 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), false));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Map.class), false, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class)));
                    }
                }), converters4);
            }
            anyTypeArr4[0] = anyType4;
            AnyType anyType5 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), true, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$8
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(String.class);
                    }
                }), converters4);
            }
            anyTypeArr4[1] = anyType5;
            Function1<Object[], String> function13 = new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$9
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] objArr) {
                    Contact mutateContact;
                    ContentResolver resolver;
                    ContentResolver resolver2;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    ContactsModule.this.ensurePermissions();
                    mutateContact = ContactsModule.this.mutateContact(null, (Map) obj);
                    ArrayList<ContentProviderOperation> insertOperationList = mutateContact.toInsertOperationList();
                    resolver = ContactsModule.this.getResolver();
                    ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", insertOperationList);
                    Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                    if (!(applyBatch.length == 0)) {
                        resolver2 = ContactsModule.this.getResolver();
                        Uri uri = applyBatch[0].uri;
                        Intrinsics.checkNotNull(uri);
                        Cursor query = resolver2.query(uri, new String[]{Columns.CONTACT_ID}, null, null, null);
                        try {
                            Cursor cursor = query;
                            if (cursor == null) {
                                throw new RetrieveIdException();
                            }
                            cursor.moveToNext();
                            String valueOf = String.valueOf(cursor.getLong(0));
                            CloseableKt.closeFinally(query, null);
                            return valueOf;
                        } finally {
                        }
                    } else {
                        throw new AddContactException();
                    }
                }
            };
            if (!Intrinsics.areEqual(String.class, Integer.TYPE)) {
                if (!Intrinsics.areEqual(String.class, Boolean.TYPE)) {
                    if (!Intrinsics.areEqual(String.class, Double.TYPE)) {
                        if (!Intrinsics.areEqual(String.class, Float.TYPE)) {
                            if (Intrinsics.areEqual(String.class, String.class)) {
                                untypedAsyncFunctionComponent3 = new StringAsyncFunctionComponent("addContactAsync", anyTypeArr4, function13);
                            } else {
                                untypedAsyncFunctionComponent3 = new UntypedAsyncFunctionComponent("addContactAsync", anyTypeArr4, function13);
                            }
                        } else {
                            untypedAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("addContactAsync", anyTypeArr4, function13);
                        }
                    } else {
                        untypedAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("addContactAsync", anyTypeArr4, function13);
                    }
                } else {
                    untypedAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("addContactAsync", anyTypeArr4, function13);
                }
            } else {
                untypedAsyncFunctionComponent3 = new IntAsyncFunctionComponent("addContactAsync", anyTypeArr4, function13);
            }
            moduleDefinitionBuilder5.getAsyncFunctions().put("addContactAsync", untypedAsyncFunctionComponent3);
            ModuleDefinitionBuilder moduleDefinitionBuilder6 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Map.class, Promise.class)) {
                untypedAsyncFunctionComponent4 = new AsyncFunctionWithPromiseComponent("updateContactAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$10
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Set set;
                        Contact contactById;
                        Contact mutateContact;
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Map map = (Map) promise;
                        ContactsModule.this.ensurePermissions();
                        String str = map.containsKey("id") ? (String) map.get("id") : null;
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(str, set);
                        if (contactById != null) {
                            mutateContact = ContactsModule.this.mutateContact(contactById, map);
                            ArrayList<ContentProviderOperation> updateOperationList = mutateContact.toUpdateOperationList();
                            resolver = ContactsModule.this.getResolver();
                            ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", updateOperationList);
                            Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                            if (applyBatch.length == 0) {
                                throw new ContactUpdateException();
                            }
                            return;
                        }
                        throw new ContactNotFoundException();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters5 = moduleDefinitionBuilder6.getConverters();
                AnyType[] anyTypeArr5 = new AnyType[1];
                AnyType anyType6 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), false));
                if (anyType6 == null) {
                    anyType6 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Map.class), false, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$11
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class)));
                        }
                    }), converters5);
                }
                anyTypeArr5[0] = anyType6;
                untypedAsyncFunctionComponent4 = new UntypedAsyncFunctionComponent("updateContactAsync", anyTypeArr5, new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$12
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        Set set;
                        Contact contactById;
                        Contact mutateContact;
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        ContactsModule.this.ensurePermissions();
                        String str = map.containsKey("id") ? (String) map.get("id") : null;
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(str, set);
                        if (contactById != null) {
                            mutateContact = ContactsModule.this.mutateContact(contactById, map);
                            ArrayList<ContentProviderOperation> updateOperationList = mutateContact.toUpdateOperationList();
                            resolver = ContactsModule.this.getResolver();
                            ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", updateOperationList);
                            Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                            if (applyBatch.length == 0) {
                                throw new ContactUpdateException();
                            }
                            return str;
                        }
                        throw new ContactNotFoundException();
                    }
                });
            }
            moduleDefinitionBuilder6.getAsyncFunctions().put("updateContactAsync", untypedAsyncFunctionComponent4);
            ModuleDefinitionBuilder moduleDefinitionBuilder7 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("removeContactAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$13
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ContactsModule.this.ensurePermissions();
                        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, (String) promise);
                        resolver = ContactsModule.this.getResolver();
                        resolver.delete(withAppendedPath, null, null);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters6 = moduleDefinitionBuilder7.getConverters();
                AnyType[] anyTypeArr6 = new AnyType[1];
                AnyType anyType7 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                if (anyType7 == null) {
                    anyType7 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), true, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$14
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }), converters6);
                }
                anyTypeArr6[0] = anyType7;
                Function1<Object[], Integer> function14 = new Function1<Object[], Integer>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$15
                    @Override // kotlin.jvm.functions.Function1
                    public final Integer invoke(Object[] objArr) {
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        ContactsModule.this.ensurePermissions();
                        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str);
                        resolver = ContactsModule.this.getResolver();
                        return Integer.valueOf(resolver.delete(withAppendedPath, null, null));
                    }
                };
                if (!Intrinsics.areEqual(Integer.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Integer.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Integer.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Integer.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Integer.class, String.class)) {
                                    untypedAsyncFunctionComponent5 = new StringAsyncFunctionComponent("removeContactAsync", anyTypeArr6, function14);
                                } else {
                                    untypedAsyncFunctionComponent5 = new UntypedAsyncFunctionComponent("removeContactAsync", anyTypeArr6, function14);
                                }
                            } else {
                                untypedAsyncFunctionComponent5 = new FloatAsyncFunctionComponent("removeContactAsync", anyTypeArr6, function14);
                            }
                        } else {
                            untypedAsyncFunctionComponent5 = new DoubleAsyncFunctionComponent("removeContactAsync", anyTypeArr6, function14);
                        }
                    } else {
                        untypedAsyncFunctionComponent5 = new BoolAsyncFunctionComponent("removeContactAsync", anyTypeArr6, function14);
                    }
                } else {
                    untypedAsyncFunctionComponent5 = new IntAsyncFunctionComponent("removeContactAsync", anyTypeArr6, function14);
                }
                asyncFunctionWithPromiseComponent3 = untypedAsyncFunctionComponent5;
            }
            moduleDefinitionBuilder7.getAsyncFunctions().put("removeContactAsync", asyncFunctionWithPromiseComponent3);
            ModuleDefinitionBuilder moduleDefinitionBuilder8 = moduleDefinitionBuilder;
            TypeConverterProvider converters7 = moduleDefinitionBuilder8.getConverters();
            AnyType[] anyTypeArr7 = new AnyType[2];
            AnyType anyType8 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), true, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$16
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(String.class);
                    }
                }), converters7);
            }
            anyTypeArr7[0] = anyType8;
            AnyType anyType9 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), true, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$17
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(String.class);
                    }
                }), converters7);
            }
            anyTypeArr7[1] = anyType9;
            Function1<Object[], Unit> function15 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$18
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    String lookupKeyForContactId;
                    Activity currentActivity;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId((String) obj);
                    if (lookupKeyForContactId == null) {
                        throw new LookupKeyNotFoundException();
                    }
                    Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/x-vcard");
                    intent.putExtra("android.intent.extra.STREAM", withAppendedPath);
                    intent.putExtra("android.intent.extra.SUBJECT", str);
                    currentActivity = ContactsModule.this.getCurrentActivity();
                    currentActivity.startActivity(intent);
                    return Unit.INSTANCE;
                }
            };
            if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                            if (Intrinsics.areEqual(Unit.class, String.class)) {
                                untypedAsyncFunctionComponent6 = new StringAsyncFunctionComponent("shareContactAsync", anyTypeArr7, function15);
                            } else {
                                untypedAsyncFunctionComponent6 = new UntypedAsyncFunctionComponent("shareContactAsync", anyTypeArr7, function15);
                            }
                        } else {
                            untypedAsyncFunctionComponent6 = new FloatAsyncFunctionComponent("shareContactAsync", anyTypeArr7, function15);
                        }
                    } else {
                        untypedAsyncFunctionComponent6 = new DoubleAsyncFunctionComponent("shareContactAsync", anyTypeArr7, function15);
                    }
                } else {
                    untypedAsyncFunctionComponent6 = new BoolAsyncFunctionComponent("shareContactAsync", anyTypeArr7, function15);
                }
            } else {
                untypedAsyncFunctionComponent6 = new IntAsyncFunctionComponent("shareContactAsync", anyTypeArr7, function15);
            }
            moduleDefinitionBuilder8.getAsyncFunctions().put("shareContactAsync", untypedAsyncFunctionComponent6);
            ModuleDefinitionBuilder moduleDefinitionBuilder9 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Map.class, Promise.class)) {
                asyncFunctionWithPromiseComponent4 = new AsyncFunctionWithPromiseComponent("writeContactToFileAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$19
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        String lookupKeyForContactId;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Map map = (Map) promise;
                        ContactsModule.this.ensureReadPermission();
                        lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId == null) {
                            throw new LookupKeyNotFoundException();
                        }
                        Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters8 = moduleDefinitionBuilder9.getConverters();
                AnyType[] anyTypeArr8 = new AnyType[1];
                AnyType anyType10 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), false));
                if (anyType10 == null) {
                    anyType10 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Map.class), false, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$20
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class)));
                        }
                    }), converters8);
                }
                anyTypeArr8[0] = anyType10;
                Function1<Object[], String> function16 = new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$21
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        String lookupKeyForContactId;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        ContactsModule.this.ensureReadPermission();
                        lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId == null) {
                            throw new LookupKeyNotFoundException();
                        }
                        return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                    }
                };
                if (!Intrinsics.areEqual(String.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(String.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(String.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(String.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(String.class, String.class)) {
                                    untypedAsyncFunctionComponent7 = new StringAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr8, function16);
                                } else {
                                    untypedAsyncFunctionComponent7 = new UntypedAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr8, function16);
                                }
                            } else {
                                untypedAsyncFunctionComponent7 = new FloatAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr8, function16);
                            }
                        } else {
                            untypedAsyncFunctionComponent7 = new DoubleAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr8, function16);
                        }
                    } else {
                        untypedAsyncFunctionComponent7 = new BoolAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr8, function16);
                    }
                } else {
                    untypedAsyncFunctionComponent7 = new IntAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr8, function16);
                }
                asyncFunctionWithPromiseComponent4 = untypedAsyncFunctionComponent7;
            }
            moduleDefinitionBuilder9.getAsyncFunctions().put("writeContactToFileAsync", asyncFunctionWithPromiseComponent4);
            ModuleDefinitionBuilder moduleDefinitionBuilder10 = moduleDefinitionBuilder;
            TypeConverterProvider converters9 = moduleDefinitionBuilder10.getConverters();
            AnyType[] anyTypeArr9 = new AnyType[3];
            AnyType anyType11 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), true, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(String.class);
                    }
                }), converters9);
            }
            anyTypeArr9[0] = anyType11;
            AnyType anyType12 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Map.class), true, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$4
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class)));
                    }
                }), converters9);
            }
            anyTypeArr9[1] = anyType12;
            AnyType anyType13 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Map.class), true, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$5
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class)));
                    }
                }), converters9);
            }
            anyTypeArr9[2] = anyType13;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent8 = new AsyncFunctionWithPromiseComponent("presentFormAsync", anyTypeArr9, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Promise promise2;
                    Contact mutateContact;
                    Set set;
                    Contact contactById;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Map map = (Map) obj2;
                    String str = (String) obj;
                    ContactsModule.this.ensureReadPermission();
                    promise2 = ContactsModule.this.contactManipulationPromise;
                    if (promise2 != null) {
                        throw new ContactManipulationInProgressException();
                    }
                    if (str != null) {
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(str, set);
                        if (contactById != null) {
                            ContactsModule.this.presentEditForm(contactById, promise);
                        } else {
                            throw new ContactNotFoundException();
                        }
                    }
                    if (map != null) {
                        mutateContact = ContactsModule.this.mutateContact(null, map);
                        ContactsModule.this.presentForm(mutateContact, promise);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder10.getAsyncFunctions().put("presentFormAsync", asyncFunctionWithPromiseComponent8);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent9 = asyncFunctionWithPromiseComponent8;
            moduleDefinitionBuilder.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$OnActivityResult$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                    invoke2(activity, onActivityResultPayload);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
                
                    r5 = r4.this$0.contactPickingPromise;
                 */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                    Promise promise;
                    Promise promise2;
                    Set set;
                    Contact contactById;
                    Bundle bundle;
                    Set<String> set2;
                    Uri data;
                    Intrinsics.checkNotNullParameter(sender, "sender");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    int requestCode = payload.getRequestCode();
                    int resultCode = payload.getResultCode();
                    Intent data2 = payload.getData();
                    if (requestCode == 2137 || requestCode == 2139) {
                        promise = ContactsModule.this.contactManipulationPromise;
                        if (promise == null) {
                            return;
                        }
                        promise.resolve(0);
                        ContactsModule.this.contactManipulationPromise = null;
                    }
                    if (requestCode != 2138 || promise2 == null) {
                        return;
                    }
                    if (resultCode == -1) {
                        String lastPathSegment = (data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment();
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(lastPathSegment, set);
                        if (contactById != null) {
                            set2 = ContactsModuleKt.defaultFields;
                            bundle = contactById.toMap(set2);
                        } else {
                            bundle = null;
                        }
                        promise2.resolve(bundle);
                    } else {
                        promise2.resolve();
                    }
                    ContactsModule.this.contactPickingPromise = null;
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder11 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent5 = new AsyncFunctionWithPromiseComponent("presentContactPickerAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$22
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Promise promise2;
                        Activity currentActivity;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        promise2 = ContactsModule.this.contactPickingPromise;
                        if (promise2 != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        ContactsModule.this.contactPickingPromise = promise;
                        currentActivity = ContactsModule.this.getCurrentActivity();
                        currentActivity.startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                    }
                });
            } else {
                TypeConverterProvider converters10 = moduleDefinitionBuilder11.getConverters();
                AnyType[] anyTypeArr10 = new AnyType[1];
                AnyType anyType14 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType14 == null) {
                    anyType14 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$23
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters10);
                }
                anyTypeArr10[0] = anyType14;
                Function1<Object[], Unit> function17 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$14$$inlined$AsyncFunction$24
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Promise promise;
                        Activity currentActivity;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise2 = (Promise) objArr[0];
                        promise = ContactsModule.this.contactPickingPromise;
                        if (promise != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        ContactsModule.this.contactPickingPromise = promise2;
                        currentActivity = ContactsModule.this.getCurrentActivity();
                        currentActivity.startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent8 = new StringAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr10, function17);
                                } else {
                                    untypedAsyncFunctionComponent8 = new UntypedAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr10, function17);
                                }
                            } else {
                                untypedAsyncFunctionComponent8 = new FloatAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr10, function17);
                            }
                        } else {
                            untypedAsyncFunctionComponent8 = new DoubleAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr10, function17);
                        }
                    } else {
                        untypedAsyncFunctionComponent8 = new BoolAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr10, function17);
                    }
                } else {
                    untypedAsyncFunctionComponent8 = new IntAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr10, function17);
                }
                asyncFunctionWithPromiseComponent5 = untypedAsyncFunctionComponent8;
            }
            moduleDefinitionBuilder11.getAsyncFunctions().put("presentContactPickerAsync", asyncFunctionWithPromiseComponent5);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentForm(Contact contact, Promise promise) {
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", contact.getFinalDisplayName());
        intent.putParcelableArrayListExtra("data", contact.getContentValues());
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_ADD_CONTACT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentEditForm(Contact contact, Promise promise) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(Long.parseLong(contact.getContactId()), contact.getLookupKey());
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(lookupUri, "vnd.android.cursor.item/contact");
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_EDIT_CONTACT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getResolver() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        ContentResolver contentResolver = reactContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact mutateContact(Contact initContact, Map<String, ? extends Object> data) {
        if (initContact == null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            initContact = new Contact(uuid, getAppContext());
        }
        String str = (String) ContactsModuleKt.safeGet(data, "firstName");
        if (str != null) {
            initContact.setFirstName(str);
        }
        String str2 = (String) ContactsModuleKt.safeGet(data, "middleName");
        if (str2 != null) {
            initContact.setMiddleName(str2);
        }
        String str3 = (String) ContactsModuleKt.safeGet(data, "lastName");
        if (str3 != null) {
            initContact.setLastName(str3);
        }
        String str4 = (String) ContactsModuleKt.safeGet(data, "namePrefix");
        if (str4 != null) {
            initContact.setPrefix(str4);
        }
        String str5 = (String) ContactsModuleKt.safeGet(data, "nameSuffix");
        if (str5 != null) {
            initContact.setSuffix(str5);
        }
        String str6 = (String) ContactsModuleKt.safeGet(data, "phoneticFirstName");
        if (str6 != null) {
            initContact.setPhoneticFirstName(str6);
        }
        String str7 = (String) ContactsModuleKt.safeGet(data, "phoneticMiddleName");
        if (str7 != null) {
            initContact.setPhoneticMiddleName(str7);
        }
        String str8 = (String) ContactsModuleKt.safeGet(data, "phoneticLastName");
        if (str8 != null) {
            initContact.setPhoneticLastName(str8);
        }
        String str9 = (String) ContactsModuleKt.safeGet(data, "company");
        if (str9 != null) {
            initContact.setCompany(str9);
        }
        String str10 = (String) ContactsModuleKt.safeGet(data, "jobTitle");
        if (str10 != null) {
            initContact.setJobTitle(str10);
        }
        String str11 = (String) ContactsModuleKt.safeGet(data, "department");
        if (str11 != null) {
            initContact.setDepartment(str11);
        }
        String str12 = (String) ContactsModuleKt.safeGet(data, "note");
        if (str12 != null) {
            initContact.setNote(str12);
        }
        if (data.containsKey("image")) {
            Object obj = data.get("image");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey("uri")) {
                    String str13 = (String) map.get("uri");
                    if (str13 != null && !StringsKt.startsWith$default(str13, "file://", false, 2, (Object) null)) {
                        throw new RemoteImageUriException(str13);
                    }
                    initContact.setPhotoUri(str13);
                    initContact.setHasPhoto(true);
                }
            }
        }
        List<PostalAddressModel> decodeList = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "addresses"), PostalAddressModel.class);
        if (decodeList != null) {
            initContact.setAddresses(decodeList);
        }
        List<PhoneNumberModel> decodeList2 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "phoneNumbers"), PhoneNumberModel.class);
        if (decodeList2 != null) {
            initContact.setPhones(decodeList2);
        }
        List<EmailModel> decodeList3 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "emails"), EmailModel.class);
        if (decodeList3 != null) {
            initContact.setEmails(decodeList3);
        }
        List<ImAddressModel> decodeList4 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "instantMessageAddresses"), ImAddressModel.class);
        if (decodeList4 != null) {
            initContact.setImAddresses(decodeList4);
        }
        List<UrlAddressModel> decodeList5 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "urlAddresses"), UrlAddressModel.class);
        if (decodeList5 != null) {
            initContact.setUrlAddresses(decodeList5);
        }
        List<ExtraNameModel> decodeList6 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "extraNames"), ExtraNameModel.class);
        if (decodeList6 != null) {
            initContact.setExtraNames(decodeList6);
        }
        List<DateModel> decodeList7 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "dates"), DateModel.class);
        if (decodeList7 != null) {
            initContact.setDates(decodeList7);
        }
        Object obj2 = data.get(DateModelKt.BIRTHDAY);
        if (obj2 != null) {
            Object obj3 = obj2 instanceof Map ? obj2 : null;
            if (obj3 != null) {
                List<DateModel> dates = initContact.getDates();
                BirthdayModel birthdayModel = new BirthdayModel();
                birthdayModel.fromMap((Map) obj3);
                dates.add(birthdayModel);
            }
        }
        List<RelationshipModel> decodeList8 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "relationships"), RelationshipModel.class);
        if (decodeList8 != null) {
            initContact.setRelationships(decodeList8);
        }
        Boolean bool = (Boolean) ContactsModuleKt.safeGet(data, "isFavorite");
        if (bool != null) {
            initContact.setFavorite(bool.booleanValue());
        }
        return initContact;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLookupKeyForContactId(String contactId) {
        Cursor query = getResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"lookup"}, "_id = " + contactId, null, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
            CloseableKt.closeFinally(cursor, null);
            return string;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact getContactById(String contactId, Set<String> keysToFetch) {
        Cursor query = getResolver().query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery(keysToFetch).getProjection(), "contact_id = ?", new String[]{contactId}, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Contact contact = (Contact) CollectionsKt.firstOrNull(loadContactsFrom(cursor).values());
            CloseableKt.closeFinally(cursor, null);
            return contact;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactPage getContactByName(String query, Set<String> keysToFetch, String sortOrder) {
        return fetchContacts(0, 9999, new String[]{query}, Columns.DISPLAY_NAME, keysToFetch, sortOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactPage getAllContactsAsync(ContactQuery options) {
        return fetchContacts(options.getPageOffset(), options.getPageSize(), null, null, options.getFields(), options.getSort());
    }

    private final QueryArguments createProjectionForQuery(Set<String> keysToFetch) {
        List list;
        String str;
        list = ContactsModuleKt.DEFAULT_PROJECTION;
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.listOf((Object[]) new String[]{"vnd.android.cursor.item/name", "vnd.android.cursor.item/organization"}));
        if (!keysToFetch.contains("phoneNumbers")) {
            str = "mimetype=? OR mimetype=?";
        } else {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add(Columns.ID);
            arrayList2.add("vnd.android.cursor.item/phone_v2");
            str = "mimetype=? OR mimetype=? OR mimetype=?";
        }
        if (keysToFetch.contains("emails")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/email_v2");
        }
        if (keysToFetch.contains("addresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.DATA_4);
            arrayList.add(Columns.DATA_5);
            arrayList.add(Columns.DATA_6);
            arrayList.add(Columns.DATA_7);
            arrayList.add(Columns.DATA_8);
            arrayList.add(Columns.DATA_9);
            arrayList.add(Columns.DATA_10);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/postal-address_v2");
        }
        if (keysToFetch.contains("note")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/note");
        }
        if (keysToFetch.contains(DateModelKt.BIRTHDAY) || keysToFetch.contains("dates")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/contact_event");
        }
        if (keysToFetch.contains("instantMessageAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.DATA_5);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/im");
        }
        if (keysToFetch.contains("urlAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/website");
        }
        if (keysToFetch.contains("extraNames")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/nickname");
        }
        if (keysToFetch.contains("relationships")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/relation");
        }
        if (keysToFetch.contains("phoneticFirstName")) {
            arrayList.add(Columns.DATA_7);
        }
        if (keysToFetch.contains("phoneticLastName")) {
            arrayList.add(Columns.DATA_9);
        }
        if (keysToFetch.contains("phoneticMiddleName")) {
            arrayList.add(Columns.DATA_8);
        }
        if (keysToFetch.contains("namePrefix")) {
            arrayList.add(Columns.DATA_4);
        }
        if (keysToFetch.contains("nameSuffix")) {
            arrayList.add(Columns.DATA_6);
        }
        if (keysToFetch.contains("isFavorite")) {
            arrayList.add(Columns.STARRED);
        }
        return new QueryArguments((String[]) arrayList.toArray(new String[0]), str, (String[]) arrayList2.toArray(new String[0]));
    }

    private final ContactPage fetchContacts(int pageOffset, int pageSize, String[] queryStrings, String initQueryField, Set<String> keysToFetch, String sortOrder) {
        Cursor query;
        if (initQueryField == null) {
            initQueryField = Columns.CONTACT_ID;
        }
        boolean z = true;
        boolean z2 = pageSize == 0;
        QueryArguments createProjectionForQuery = createProjectionForQuery(keysToFetch);
        ContentResolver resolver = getResolver();
        if (queryStrings != null && queryStrings.length != 0) {
            query = resolver.query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery.getProjection(), initQueryField + " LIKE ?", queryStrings, null);
        } else {
            query = resolver.query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery.getProjection(), createProjectionForQuery.getSelection(), createProjectionForQuery.getSelectionArgs(), null);
        }
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Map<String, Contact> loadContactsFrom = loadContactsFrom(cursor);
            ArrayList arrayList = new ArrayList();
            ArrayList<Contact> sortContactsBy = sortContactsBy(new ArrayList<>(loadContactsFrom.values()), sortOrder);
            int size = sortContactsBy.size();
            for (int i = z2 ? 0 : pageOffset; i < size; i++) {
                Contact contact = sortContactsBy.get(i);
                Intrinsics.checkNotNullExpressionValue(contact, "get(...)");
                Contact contact2 = contact;
                if (!z2 && i - pageOffset >= pageSize) {
                    break;
                }
                arrayList.add(contact2);
            }
            ArrayList arrayList2 = arrayList;
            boolean z3 = pageOffset > 0;
            if (pageOffset + pageSize >= size) {
                z = false;
            }
            ContactPage contactPage = new ContactPage(arrayList2, z3, z, size);
            CloseableKt.closeFinally(cursor, null);
            return contactPage;
        } finally {
        }
    }

    private final ArrayList<Contact> sortContactsBy(ArrayList<Contact> input, String sortOrder) {
        if (Intrinsics.areEqual(sortOrder, "firstName")) {
            final Function2 function2 = new Function2() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int sortContactsBy$lambda$42;
                    sortContactsBy$lambda$42 = ContactsModule.sortContactsBy$lambda$42((Contact) obj, (Contact) obj2);
                    return Integer.valueOf(sortContactsBy$lambda$42);
                }
            };
            CollectionsKt.sortWith(input, new Comparator() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int sortContactsBy$lambda$43;
                    sortContactsBy$lambda$43 = ContactsModule.sortContactsBy$lambda$43(Function2.this, obj, obj2);
                    return sortContactsBy$lambda$43;
                }
            });
            return input;
        }
        if (Intrinsics.areEqual(sortOrder, "lastName")) {
            final Function2 function22 = new Function2() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int sortContactsBy$lambda$44;
                    sortContactsBy$lambda$44 = ContactsModule.sortContactsBy$lambda$44((Contact) obj, (Contact) obj2);
                    return Integer.valueOf(sortContactsBy$lambda$44);
                }
            };
            CollectionsKt.sortWith(input, new Comparator() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int sortContactsBy$lambda$45;
                    sortContactsBy$lambda$45 = ContactsModule.sortContactsBy$lambda$45(Function2.this, obj, obj2);
                    return sortContactsBy$lambda$45;
                }
            });
        }
        return input;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$42(Contact contact, Contact contact2) {
        return StringsKt.compareTo(contact.getFinalFirstName(), contact2.getFinalFirstName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$43(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$44(Contact contact, Contact contact2) {
        return StringsKt.compareTo(contact.getFinalLastName(), contact2.getFinalLastName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$45(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final Map<String, Contact> loadContactsFrom(Cursor cursor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex(Columns.CONTACT_ID));
            Object obj = linkedHashMap.get(string);
            if (obj == null) {
                Intrinsics.checkNotNull(string);
                obj = new Contact(string, getAppContext());
                linkedHashMap.put(string, obj);
            }
            ((Contact) obj).fromCursor(cursor);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureReadPermission() {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.READ_CONTACTS")) {
            throw new MissingPermissionException("android.permission.READ_CONTACTS");
        }
    }

    private final void ensureWritePermission() {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.WRITE_CONTACTS")) {
            throw new MissingPermissionException("android.permission.WRITE_CONTACTS");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensurePermissions() {
        ensureReadPermission();
        ensureWritePermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startObservingContactChanges() {
        if (this.contactChangeObserver != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ContactsObserverThread");
        this.contactsHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.contactsHandlerThread;
        Intrinsics.checkNotNull(handlerThread2);
        final Handler handler = new Handler(handlerThread2.getLooper());
        this.contactsHandler = handler;
        ContentObserver contentObserver = new ContentObserver(handler) { // from class: expo.modules.contacts.ContactsModule$startObservingContactChanges$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                super.onChange(selfChange, uri);
                ContactsModule.this.handleContactChange();
            }
        };
        Iterator it = CollectionsKt.listOf((Object[]) new Uri[]{ContactsContract.Contacts.CONTENT_URI, ContactsContract.RawContacts.CONTENT_URI}).iterator();
        while (it.hasNext()) {
            getResolver().registerContentObserver((Uri) it.next(), true, contentObserver);
        }
        this.contactChangeObserver = contentObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObservingContactChanges() {
        ContentObserver contentObserver = this.contactChangeObserver;
        if (contentObserver != null) {
            getResolver().unregisterContentObserver(contentObserver);
            this.contactChangeObserver = null;
        }
        this.contactsHandler = null;
        HandlerThread handlerThread = this.contactsHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.contactsHandlerThread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleContactChange() {
        sendEvent(ContactsModuleKt.onContactsChangeEventName, MapsKt.mapOf(TuplesKt.to("body", null)));
    }
}
