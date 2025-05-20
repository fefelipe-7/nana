pub struct AST {
    pub tokens: Vec<String>,
}

pub fn parse(tokens: &[String]) -> AST {
    AST {
        tokens: tokens.to_vec(),
    }
}
