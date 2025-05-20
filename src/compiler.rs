use crate::parser::AST;

pub fn gerar_assembly(ast: &AST) -> String {
    let mut saida = String::new();

    // Header em assembly
    saida.push_str("section .text\n");
    saida.push_str("global _start\n\n");

    saida.push_str("_start:\n");

    // Por enquanto, só escreve um exit simples
    saida.push_str("    mov rax, 60\n"); // syscall: exit
    saida.push_str("    xor rdi, rdi\n"); // status 0
    saida.push_str("    syscall\n");

    saida
}
