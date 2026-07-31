package yads;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gy1 extends i {
    private static final long serialVersionUID = 0;
    public transient i53 g;

    public gy1(Map map, dy1 dy1Var) {
        super(map);
        this.g = dy1Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.g = (i53) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.e = map;
        this.f = 0;
        for (Collection collection : map.values()) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.f = collection.size() + this.f;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(this.e);
    }
}
