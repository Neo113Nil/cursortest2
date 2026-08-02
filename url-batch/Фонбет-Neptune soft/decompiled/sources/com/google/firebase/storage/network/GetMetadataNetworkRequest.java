package com.google.firebase.storage.network;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* loaded from: classes.dex */
public class GetMetadataNetworkRequest extends NetworkRequest {
    public GetMetadataNetworkRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp) {
        super(storageReferenceUri, firebaseApp);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    protected String getAction() {
        return ShareTarget.METHOD_GET;
    }
}
