package gov.bfar.training.accountapi.logging;

import static gov.bfar.training.accountapi.logging.Preconditions.checkNotNull;

import java.util.LinkedHashMap;
import java.util.Map;

class Parameters {
    private Map<String, Object> params = new LinkedHashMap<>();

    protected void put(String key, Object value) {
        checkNotNull(key, "require key");
        params.put(key, value);
    }

    protected void put(final Key key, final Object detail) {
        put(key.getKey(), detail);
    }

    protected void putAll(final Map<String, Object> keyValues) {
        params.putAll(keyValues);
    }

    protected Map<String, Object> getParameters() {
        return params;
    }
}
