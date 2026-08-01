package androidx.room;

/* loaded from: classes.dex */
public abstract class u {
    public final int version;

    public u(int i) {
        this.version = i;
    }

    public abstract void createAllTables(j0.a aVar);

    public abstract void dropAllTables(j0.a aVar);

    public abstract void onCreate(j0.a aVar);

    public abstract void onOpen(j0.a aVar);

    public abstract void onPostMigrate(j0.a aVar);

    public abstract void onPreMigrate(j0.a aVar);

    public abstract v onValidateSchema(j0.a aVar);

    public void validateMigration(j0.a aVar) {
        g1.f.e(aVar, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
