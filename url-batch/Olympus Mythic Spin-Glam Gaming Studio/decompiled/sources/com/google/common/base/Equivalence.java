package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes13.dex */
public abstract class Equivalence {
    protected abstract boolean doEquivalent(Object obj, Object obj2);

    protected abstract int doHash(Object obj);

    protected Equivalence() {
    }

    public final boolean equivalent(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return doEquivalent(obj, obj2);
    }

    public final int hash(Object obj) {
        if (obj == null) {
            return 0;
        }
        return doHash(obj);
    }

    public final <F> Equivalence onResultOf(Function function) {
        return new FunctionalEquivalence(function, this);
    }

    public final <S> Wrapper<S> wrap(S s) {
        return new Wrapper<>(s);
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence equivalence;
        private final T reference;

        /* JADX WARN: Multi-variable type inference failed */
        private Wrapper(Equivalence equivalence, Object obj) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = obj;
        }

        public T get() {
            return this.reference;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }
    }

    public final <S> Equivalence pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final Predicate equivalentTo(Object obj) {
        return new EquivalentToPredicate(this, obj);
    }

    private static final class EquivalentToPredicate<T> implements Predicate, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence equivalence;
        private final T target;

        EquivalentToPredicate(Equivalence equivalence, T t) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.target = t;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            return this.equivalence.equals(equivalentToPredicate.equivalence) && Objects.equal(this.target, equivalentToPredicate.target);
        }

        public int hashCode() {
            return Objects.hashCode(this.equivalence, this.target);
        }

        public String toString() {
            return this.equivalence + ".equivalentTo(" + this.target + ")";
        }
    }

    public static Equivalence equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence identity() {
        return Identity.INSTANCE;
    }

    static final class Equals extends Equivalence implements Serializable {
        static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(Object obj) {
            return obj.hashCode();
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    static final class Identity extends Equivalence implements Serializable {
        static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        Identity() {
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(Object obj) {
            return System.identityHashCode(obj);
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }
}
