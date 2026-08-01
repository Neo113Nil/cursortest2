package androidx.room;

import j0.InterfaceC0178a;

/* loaded from: classes.dex */
public abstract class u {
    public final int version;

    public u(int i) {
        this.version = i;
    }

    public abstract void createAllTables(InterfaceC0178a interfaceC0178a);

    public abstract void dropAllTables(InterfaceC0178a interfaceC0178a);

    public abstract void onCreate(InterfaceC0178a interfaceC0178a);

    public abstract void onOpen(InterfaceC0178a interfaceC0178a);

    public abstract void onPostMigrate(InterfaceC0178a interfaceC0178a);

    public abstract void onPreMigrate(InterfaceC0178a interfaceC0178a);

    public abstract v onValidateSchema(InterfaceC0178a interfaceC0178a);

    public void validateMigration(InterfaceC0178a interfaceC0178a) {
        i1.f.e(interfaceC0178a, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
