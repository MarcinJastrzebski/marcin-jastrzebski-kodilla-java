package com.kodilla.good.patterns.challanges.ProductOrderService;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private StockService stockService;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository, final StockService stockService) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.stockService = stockService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getDate(),
                orderRequest.getProduct(), orderRequest.getQuantity(), stockService);

        if(isOrdered) {
            informationService.inform(orderRequest, isOrdered);
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getDate(), orderRequest.getProduct());
            stockService.removeItemsFromStock(orderRequest.getProduct(),orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            informationService.inform(orderRequest, isOrdered);
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}