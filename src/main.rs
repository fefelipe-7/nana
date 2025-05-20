mod lexer;
mod parser;
mod compiler;

use std::env;
use std::fs;

fn main() {
    let args: Vec<String> = env::args().collect();

    if args.len() != 3 || args[1] != "run" {
        eprintln!("Uso: nana run arquivo.nana");
        return;
    }

    let filename = &args[2];
    let code = fs::read_to_string(filename)
        .expect("Erro ao ler o arquivo");

    // Etapas principais do compilador
    let tokens = lexer::tokenizar(&code);
    let ast = parser::parse(&tokens);
    let assembly = compiler::gerar_assembly(&ast);

    // Salva o código assembly em um arquivo
    fs::write("saida.asm", assembly).expect("Erro ao salvar o código gerado");

    println!("Código Assembly salvo como 'saida.asm'");
}
