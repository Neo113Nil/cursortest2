package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import o.C0550Vc;

/* loaded from: classes.dex */
public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        String extract(T t);
    }

    private LibraryVersionComponent() {
    }

    public static Component<?> create(String str, String str2) {
        return Component.intoSet(LibraryVersion.create(str, str2), (Class<LibraryVersion>) LibraryVersion.class);
    }

    public static Component<?> fromContext(String str, VersionExtractor<Context> versionExtractor) {
        return Component.intoSetBuilder(LibraryVersion.class).add(Dependency.required((Class<?>) Context.class)).factory(new C0550Vc(1, versionExtractor, str)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LibraryVersion lambda$fromContext$0(String str, VersionExtractor versionExtractor, ComponentContainer componentContainer) {
        return LibraryVersion.create(str, versionExtractor.extract((Context) componentContainer.get(Context.class)));
    }
}
