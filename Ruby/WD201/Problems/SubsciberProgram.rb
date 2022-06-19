describe "#run!" do
    context "when the subscription is active" do
        it "charges the correct amount" do
            subscription = build_stubbed(:subscription,active: true, amount: 100)

            SubscriptionCharger.new(subscription).run!

            expect(last_amount_charged).to eq 100
        end
    end
    context "when the subscription is inactive" do
        it "does not charge anything" do
            subscription = build_stubbed(:subscription, active: false,amount: 100)

            SubscriptionCharger.new(subscription).run!

            expect(last_amount_charged).to eq 0
        end  
    end
    def last_amount_charged
        Charge.last!.amount 
    end
end
class SubscriptionCharger
        def initialize(subscription)
            @subscription=subscription
        end
        def run!
            @subscription.charge!
        end
end
class Subscription < ApplicationRecord
    def charge(amount:)
        Charge.create!(amount: amount)
    end
    def charge!
        if @subscription.active?
                charge(amount: amount)
        else 
                charge(amount: 0)
        end
    end
end   
