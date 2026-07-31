package com.google.common.base;

import com.google.common.base.Suppliers;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes10.dex */
public abstract class Suppliers {
    public static Supplier memoize(Supplier supplier) {
        if ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) {
            return supplier;
        }
        if (supplier instanceof Serializable) {
            return new MemoizingSupplier(supplier);
        }
        return new NonSerializableMemoizingSupplier(supplier);
    }

    static class MemoizingSupplier<T> implements Supplier, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier delegate;
        volatile transient boolean initialized;
        private transient Object lock = new Object();
        transient T value;

        MemoizingSupplier(Supplier supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            if (!this.initialized) {
                synchronized (this.lock) {
                    try {
                        if (!this.initialized) {
                            T t = (T) this.delegate.get();
                            this.value = t;
                            this.initialized = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.initialized) {
                obj = "<supplier that returned " + this.value + ">";
            } else {
                obj = this.delegate;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.lock = new Object();
        }
    }

    static class NonSerializableMemoizingSupplier implements Supplier {
        private static final Supplier SUCCESSFULLY_COMPUTED = new Supplier() { // from class: com.google.common.base.Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Void lambda$static$0;
                lambda$static$0 = Suppliers.NonSerializableMemoizingSupplier.lambda$static$0();
                return lambda$static$0;
            }
        };
        private volatile Supplier delegate;
        private final Object lock = new Object();
        private Object value;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void lambda$static$0() {
            throw new IllegalStateException();
        }

        NonSerializableMemoizingSupplier(Supplier supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public Object get() {
            Supplier supplier = this.delegate;
            Supplier supplier2 = SUCCESSFULLY_COMPUTED;
            if (supplier != supplier2) {
                synchronized (this.lock) {
                    try {
                        if (this.delegate != supplier2) {
                            Object obj = this.delegate.get();
                            this.value = obj;
                            this.delegate = supplier2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj = this.delegate;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == SUCCESSFULLY_COMPUTED) {
                obj = "<supplier that returned " + this.value + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static Supplier ofInstance(Object obj) {
        return new SupplierOfInstance(obj);
    }

    private static class SupplierOfInstance<T> implements Supplier, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            return this.instance;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.instance + ")";
        }
    }
}
