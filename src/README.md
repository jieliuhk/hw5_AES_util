## AES

The util class you can use to encrypt input string or byte sequence, see java doc for usage details.

## Base64 encode

IMPORTANT: "encode" in this context is totally different from the "encryption" in cryptography.

The reason we use the Base64 encoding is to avoid corrupted data
during translation, we encode the binary sequence into text, it is less
chance for a text message to be modified during transmission compare to the binary sequence. And it is human readable. In this projetc, you can ignore the detail and just use StringUtil.encodeToString to convert your 64bits result to a String.

