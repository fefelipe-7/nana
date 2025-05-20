pub fn tokenizar(codigo: &str) -> Vec<String> {
    // (Por enquanto, apenas divide por espaços e quebras de linha)
    codigo
        .split_whitespace()
        .map(|s| s.to_string())
        .collect()
}
