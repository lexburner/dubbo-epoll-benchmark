### 项目介绍

本项目创建旨在测试 EpollSocketChannel 与 NioSocketChannel 相比性能是否存在提升

### 前置

(mac) brew install wrk

### 测试方法

入口为 http，实现 consumer 调用 provider。测试脚本使用 wrk 对 consumer 进行压测，
最终结果以 qps 为准

nio 方式启动 consumer 和 provider
sh start-consumer.sh
sh start-provider.sh
sh benchmark.sh

epoll 方式启动 consumer 和 provider
sh start-consumer-poll.sh
sh start-provider-poll.sh
sh benchmark.sh

### 测试 dubbo 分支

自己配备好 producer 和 consumer 的 dubbo 实现，在启动脚本中设置好 epoll 参数
