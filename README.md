# Entity to DTO Converter POC

A lightweight Java POC for converting between Entities and DTOs with minimal boilerplate code using MaStruct Framework.

## Features

- 🚀 Simple and intuitive API
- 🔄 Bidirectional conversion (Entity ↔ DTO)
- ⚡ Reflection-based but optimized for performance
- 🧩 Customizable conversion logic

## Usage

- Converting Entity to DTO
<pre><code>UsuarioDTO dto = EntityDTOConverter.convertToDTO(usuarioEntity, UsuarioDTO.class);</code></pre>

- Converting DTO to Entity
<pre><code>Usuario entity = EntityDTOConverter.convertToEntity(usuarioDTO, Usuario.class);</code></pre>

