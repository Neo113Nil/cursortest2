# Cloaking hints

Launcher: com.trophynumbers.puzzlix.gateflow.StagePortalFrame
Application: com.pairip.application.Application → CoreLaunchPoint (Adjust init, token 8akot1mmineo, production)
FCM: SignalIntakeLine, payload field `url`
Prefs file: core_slot_vault
Prefs key gate_entry_path: offer URL or `gate_done`
Gate POST: https://aetherdrift.site/ (application/octet-stream, AES-GCM)
Play probe: GET https://play.google.com/store/apps/details?id=<package>&hl=en — HTTP 200 → white MainChoiceScreen
Offer: WebView loadUrl + Chrome Custom Tabs (com.android.chrome) + ACTION_VIEW
StringFog XOR (t40.a)
WebViewClient: defpackage.d40.shouldOverrideUrlLoading
