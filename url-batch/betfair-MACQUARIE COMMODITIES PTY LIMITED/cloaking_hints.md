# Cloaking hints (betfair / MACQUARIE COMMODITIES PTY LIMITED / Swaba)

- Play title «betfair» ≠ APK application-label «Swaba». Альтернативный ярлык лаунчера: «1Win».
- Application: `com.pairip.application.Application` — `LicenseClient.checkLicense` в `attachBaseContext` (Play license, не gate).
- LAUNCHER: `com.swaba.app.MainActivity` через alias `LauncherLabelDefault` (ярлык Swaba) / `LauncherLabelAlt` (ярлык 1Win).
- Белая оболочка: DoorActivity (меню), BulletActivity (игра), ZoneActivity (статистика), BridgeActivity (результат).
- Gate URL собрана из int[] − 8: `https://icy-surf-1d56.gaddamashok704.workers.dev/` + `?app=` + `getPackageName()`.
- OkHttp GET (`dt`), followRedirects по умолчанию. Заголовки: `X-Device-Model` (`Build.MODEL`), `Accept-Language` (хардкод `en-US,en;q=0.9`), `User-Agent` (`WebSettings.getDefaultUserAgent`).
- Если итоговый URL после редиректов НЕ содержит `workers.dev` → сохраняют `app_cfg_store` / `cached_redirect_url`, открывают `ACTION_VIEW`. `onResume` снова открывает ссылку.
- Если URL остаётся на `workers.dev` и тело содержит `"status":"ok"`: читают JSON `offer_enabled`, `offer_url`, `alt_launcher_label`. Если `offer_enabled` и `offer_url` начинается с `http` → `ACTION_VIEW`. Иначе DoorActivity.
- Если тела без `"status":"ok"`, ошибка сети или нет сети — DoorActivity (белая оболочка).
- WebView.loadUrl / Custom Tabs нет. Рекламных SDK / Firebase нет. GAID в запросе не читается (только permission AD_ID).
