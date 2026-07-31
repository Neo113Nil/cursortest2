package org.chromium.base.lifetime;

import internal.org.chromium.build.BuildConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.task.PostTask;

/* loaded from: classes9.dex */
public class LifetimeAssert {
    public static final /* synthetic */ int $r8$clinit = 0;
    private final Object mTarget;
    final WrappedReference mWrapper;

    static class LifetimeAssertException extends RuntimeException {
        LifetimeAssertException(String str, Throwable th) {
            super(str, th);
        }
    }

    private static class CreationException extends RuntimeException {
        CreationException() {
            super("vvv This is where object was created. vvv");
        }
    }

    static class WrappedReference extends PhantomReference {
        final CreationException mCreationException;
        boolean mSafeToGc;
        final Class mTargetClass;
        private static final ReferenceQueue sReferenceQueue = new ReferenceQueue();
        private static final Set sActiveWrappers = Collections.synchronizedSet(new HashSet());

        private WrappedReference(Object obj, CreationException creationException, boolean z) {
            super(obj, sReferenceQueue);
            this.mCreationException = (CreationException) PostTask.maybeAddTaskOrigin(creationException);
            this.mSafeToGc = z;
            this.mTargetClass = obj.getClass();
            sActiveWrappers.add(this);
        }

        static {
            new Thread("GcStateAssertQueue") { // from class: org.chromium.base.lifetime.LifetimeAssert.WrappedReference.1
                {
                    setDaemon(true);
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            WrappedReference wrappedReference = (WrappedReference) WrappedReference.sReferenceQueue.remove();
                            if (WrappedReference.sActiveWrappers.remove(wrappedReference)) {
                                if (!wrappedReference.mSafeToGc) {
                                    String format = String.format("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", wrappedReference.mTargetClass.getName());
                                    int i = LifetimeAssert.$r8$clinit;
                                    throw new LifetimeAssertException(format, wrappedReference.mCreationException);
                                }
                                int i2 = LifetimeAssert.$r8$clinit;
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
        }
    }

    private LifetimeAssert(WrappedReference wrappedReference, Object obj) {
        this.mWrapper = wrappedReference;
        this.mTarget = obj;
    }

    public static LifetimeAssert create(Object obj) {
        if (BuildConfig.ENABLE_ASSERTS) {
            return new LifetimeAssert(new WrappedReference(obj, new CreationException(), false), obj);
        }
        return null;
    }

    public static void setSafeToGc(LifetimeAssert lifetimeAssert, boolean z) {
        if (BuildConfig.ENABLE_ASSERTS) {
            synchronized (lifetimeAssert.mTarget) {
                lifetimeAssert.mWrapper.mSafeToGc = z;
            }
        }
    }

    public static void assertNotDestroyed(LifetimeAssert lifetimeAssert) {
        boolean z = BuildConfig.ENABLE_ASSERTS;
    }

    public static void destroy(LifetimeAssert lifetimeAssert) {
        assertNotDestroyed(lifetimeAssert);
        setSafeToGc(lifetimeAssert, true);
    }
}
