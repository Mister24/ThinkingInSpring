# ThinkingInSpring

![Java](https://img.shields.io/badge/Java-8-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.1.5-blue.svg)

> Spring Boot 基础学习仓库，覆盖 IoC/DI、Bean 生命周期等核心机制。

## 项目简介
以最小依赖的 Spring Boot 工程，配合单元测试（JUnit 4.12）动手验证 Spring 的核心特性，适合入门对照理解"容器如何工作"。

## 技术栈
- Java 8
- Spring Boot 2.1.5
- JUnit 4.12、Lombok
- 构建：Maven

## 目录结构
```
src/
├── main/java/com/fzw/   # 示例：配置类、Bean 定义、组件扫描等
└── test/                # JUnit 单元测试（验证容器行为）
```

## 运行 / 测试
```bash
mvn test                # 运行单元测试
mvn spring-boot:run     # 启动工程
```

## 说明
- 个人学习项目。
- 仓库未声明开源协议（LICENSE）。
