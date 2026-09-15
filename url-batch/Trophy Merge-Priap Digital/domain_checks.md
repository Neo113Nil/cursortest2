# Проверка подозрительных доменов

Кастомный хост из кода приложения (StringFog): `aetherdrift.site`.
Это адрес тихой проверки (gate), а не SDK.

Пайплайн мог зацепить `app.adjust.io` / `gdpr.adjust.io` / `ssrv.adjust.io` / `subscription.adjust.io` (SDK Adjust) и
`config.ru` (языковой split Android App Bundle `config.ru`, не сайт). По правилам отчёта
это не подозрительные домены.

## Проверка домена: aetherdrift.site

Формат как на VirusTotal → Security vendors' analysis, в конце три доп. пункта.

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | aetherdrift.site |
| VirusTotal URL | https://www.virustotal.com/gui/domain/aetherdrift.site |
| Детекции | нет |
| Куда редиректит | нет (HTTP 403 Cloudflare, без редиректа) |
| Что выводит (кратко) | пустой ответ, код 403 |
| Где припаркован | регистратор: NameCheap, Inc.; DNS: Cloudflare |
